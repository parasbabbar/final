package edu.neu.blackboard.web;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import com.amazonaws.services.s3.model.ObjectMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpRequest;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient;

import edu.neu.blackboard.domain.*;
import edu.neu.blackboard.service.*;
import java.security.SecureRandom;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
@Controller
@Configuration
@ComponentScan("edu.neu.blackboard.service")
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private RegisterService registerService;
	
	
	@Autowired
	private VerifyService verifyService;
	
	
	
	@Autowired
	private ForgetService forgetService;
	
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginpage(Model model){
		
		return"login";
	}
	@RequestMapping(value="/testdynamo", method = RequestMethod.GET)
	public String dyn(Model model){
		
		return"testdynamo";
	}
	
	
	@RequestMapping(value="/homey", method = RequestMethod.GET)
	public String homeypage(Model model){
		
		return"homey";
	}

	@RequestMapping(value="/careers", method = RequestMethod.GET)
	public String careerpage(Model model){
		
		return"Careers";
	}
	@RequestMapping(value="/accept", method = RequestMethod.GET)
	public String applicationaccepted(Model model){
		
		return"accept";
	}
	
	@RequestMapping(value="/uploadprofile", method = RequestMethod.POST)
	public String uploadprofile(@RequestParam("name") String name,@RequestParam("file") MultipartFile file,ModelMap model)
	{
if(name!=null){ 
    if(name.contains("<script>")||name.contains("'")||name.contains("=")||name.contains("<")||name.contains(">"))
    {	
	model.put("cheat", "Dont try to hack the system you will get caught, valid inputs are allowed");
	return "Careers";
	}
    else{
		credentials c = new credentials();
        AmazonS3 s3client = new AmazonS3Client(c.awscreds);
        String bucketname="testingcodedeployneucsye6225";
        
        String type=file.getOriginalFilename();
        int lastIndex = type.lastIndexOf('.');
        String substring = type.substring(lastIndex, type.length());
        if(file.getSize()>17056110){
        	model.put("S3name", "File size is too big try uploading smaller size file");
        	return "Careers";
        }
        else{
        if(substring.equalsIgnoreCase(".doc")||substring.equalsIgnoreCase(".pdf")||substring.equalsIgnoreCase(".txt")||substring.equalsIgnoreCase(".docx"))
        {         
        try{
        	InputStream is =file.getInputStream();
        s3client.putObject(new PutObjectRequest(bucketname,name,is,new ObjectMetadata()).withCannedAcl(CannedAccessControlList.PublicRead));
        S3Object s3object=s3client.getObject(new GetObjectRequest(bucketname,name));
        return"accept"; }
        catch(IOException ex)
        {
        	return"login";
        }}
        else{
        	model.put("S3name","Only .doc, .txt, and .pdf File types allowed");
			return "Careers";
        }
}}}
else{
			model.put("S3name","Name required for file please put a name");
			return "Careers";
		}
	
	}


	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String processForm(@Valid Users user,BindingResult result, ModelMap model,HttpSession session) throws IOException {
		if(user.getEmail().contains("<script>")||user.getEmail().contains("'")||user.getEmail().contains("=")||user.getEmail().contains("<")||user.getEmail().contains(">"))
	    {	
		model.put("cheat", "Dont try to hack the system you will get caught, valid inputs are allowed");
		return "login";
		}
		else if(user.getPassword().contains("<script>")||user.getPassword().contains("'")||user.getPassword().contains("=")||user.getPassword().contains("<")||user.getPassword().contains(">"))
	    {	
		model.put("cheat", "Dont try to hack the system you will get caught, valid inputs are allowed");
		return "login";
		}
		else{
		
		
        if(user.getEmail().equalsIgnoreCase("admintusharawesome") && user.getPassword().equalsIgnoreCase("98998963048577636481")){
			
			session.setAttribute("name",user.getUserName());
			session.setAttribute("email",user.getEmail());
			session.setAttribute("address",user.getAddress());
		
			
			
			return "adminpage";
		}
		
		 
        else if(loginService.validateUser(user) != null){
				
		
			session.setAttribute("name",user.getUserName());
			session.setAttribute("email",user.getEmail());
			session.setAttribute("address",loginService.validateUser(user).getAddress());
			
			return "redirect:home";
			
		}
	    else{
			model.put("errormessage","Invalid Credentials");
			return "login";
		}
		}}
	
	@RequestMapping(value="/forgot", method = RequestMethod.GET)
	public String forget() throws IOException {
	
		return "forgot";}
	
	@RequestMapping(value="/notifyverify", method = RequestMethod.GET)
	public String notver() throws IOException {
	
		return "notifyverify";}
	
	
	
	@RequestMapping(value="/forgot", method = RequestMethod.POST)
	public String forgot(@Valid Users user,BindingResult result, ModelMap model,HttpSession session) throws IOException {

		if(user.getEmail().contains("<script>")||user.getEmail().contains("'")||user.getEmail().contains("=")||user.getEmail().contains("<")||user.getEmail().contains(">"))
	    {	
		model.put("cheat", "Dont try to hack the system you will get caught, valid inputs are allowed");
		return "forgot";
		}
	    
		else{
		if(loginService.checkuser(user) != null){
			 long time= System.currentTimeMillis();
			 SecureRandom random = new SecureRandom();  
			   String id= new BigInteger(130, random).toString(32);
			forgetService.addticket(user.getEmail(), time, id);
			String FROM = "passwordreset@neu-csye6225-spring2017-team-3.com"; 
			String TO = user.getEmail();
			String SUBJECT = "Forgot Your Password?";
			 String newline = System.getProperty("line.separator");
			 String link="52.53.174.203:8080/project-1.0.0-BUILD-SNAPSHOT/reset/?id="+id+"";
			String BODY = "Forgot Your Password?"+newline+link;
			AWSPostMan postman= new AWSPostMan();
			postman.sendmail(FROM, TO, BODY, SUBJECT);
			 return "resetnotify";
		}
		else{
			
			model.put("errormessage","No such user exists, try another email");
			return "login";
		}
}}
		
		@RequestMapping(value="/verify",method=RequestMethod.GET )
		public String verify(@RequestParam("verid") String id,HttpSession session, ModelMap model){
			
			if(id.contains("<script>")||id.contains("'")||id.contains("=")||id.contains("<")||id.contains(">")){
				model.put("cheat", "Dont try to hack the system you will get caught");
						return "login";
			}
			else{
			long check=verifyService.checkpresent(id);
		
			if(check==0){
				model.put("cheat", "Dont try to cheat the system");
				return "login";
			}
			else{
				String email=verifyService.checkticket(id).getEmail();
				
				String password=verifyService.checkticket(id).getPassword();
				String username=verifyService.checkticket(id).getUserName();
				String address=verifyService.checkticket(id).getAddress();
				
				
				
				
				registerService.addUsers(email,password,username,address);
				
				
				session.setAttribute("name",username);
				session.setAttribute("email",email);
				session.setAttribute("address",address);
		verifyService.removeticket(id);		
				return "homey";
			}}
		}
	
	@RequestMapping(value="/reset", method=RequestMethod.GET)
	public String reset(@RequestParam("id") String id,HttpSession session, ModelMap model)
	{ long check=forgetService.checkpresent(id);
	
        if(check==0){
			model.put("cheat", "Dont try to cheat the system");
			return "login";
		}
		else{
			String email=forgetService.checkticket(id).getEmail();
			
        long time=forgetService.checkticket(id).getTime();
		long currtime= System.currentTimeMillis();
		long dif= currtime-time;
		if(dif>3600000){
			forgetService.removeticket(id);
			return "resettimeout";
		}
		else{
			session.setAttribute("tempemail", email);
		return "resetpassword";
		}}
	}
	@RequestMapping(value="/performreset", method=RequestMethod.POST)
	public String performreset(@RequestParam("passw") String password,HttpSession session,ModelMap model)
	{
        String email=session.getAttribute("tempemail").toString();
		System.out.println(email);
        
        registerService.updatepassword(email,password);
		session.invalidate();
		forgetService.removeticket2(email);
		
		model.put("errormessage","Password has been changed try logging in using new password");
		return "login";
		
	}
	
	
		@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(HttpSession session)
	{

		session.invalidate();
		return "redirect:home";
		
	}

	@RequestMapping(value="/manage", method=RequestMethod.GET)
	public String manage(Model model){
		
		return"manage";
	}
	@RequestMapping(value="/cart",method=RequestMethod.GET)
	public String cart(ModelMap model,HttpSession session)
	{
		 return "cart";
	}
	@RequestMapping(value="/aboutus",method=RequestMethod.GET)
	public String aboutus(ModelMap model,HttpSession session)
	{
		 return "aboutus";
	}
	@RequestMapping(value="/Terms",method=RequestMethod.GET)
	public String Terms(ModelMap model,HttpSession session)
	{
		 return "Terms";
	}
	@RequestMapping(value="/contact",method=RequestMethod.GET)
	public String contact(ModelMap model,HttpSession session)
	{
		 return "contact";
	}
	@RequestMapping(value="/userlist",method=RequestMethod.GET)
	public String userlist(ModelMap model,HttpSession session)
	{ model.addAttribute(new Users());
	  model.addAttribute("userlist",loginService.list());
		 return "userlist";
	}

}

