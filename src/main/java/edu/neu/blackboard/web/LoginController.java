package edu.neu.blackboard.web;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

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

import edu.neu.blackboard.domain.*;
import edu.neu.blackboard.service.*;
import java.security.SecureRandom;
import java.io.IOException;
import java.math.BigInteger;

@Controller
@Configuration
@ComponentScan("edu.neu.blackboard.service")
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private RegisterService registerService;
	
	
	
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

	

	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String processForm(@Valid Users user,BindingResult result, ModelMap model,HttpSession session) throws IOException {

        if(user.getEmail().equalsIgnoreCase("admin") && user.getPassword().equalsIgnoreCase("root")){
			
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
		}
	
	@RequestMapping(value="/forgot", method = RequestMethod.GET)
	public String forget() throws IOException {
	
		return "forgot";}
	
	@RequestMapping(value="/forgot", method = RequestMethod.POST)
	public String forgot(@Valid Users user,BindingResult result, ModelMap model,HttpSession session) throws IOException {


		
		if(loginService.checkuser(user) != null){
			 long time= System.currentTimeMillis();
			 SecureRandom random = new SecureRandom();  
			   String id= new BigInteger(130, random).toString(32);
			forgetService.addticket(user.getEmail(), time, id);
			String FROM = "passwordreset@neu-csye6225-spring2017-team-3.com"; 
			String TO = user.getEmail();
			String SUBJECT = "Forgot Your Password?";
			 String newline = System.getProperty("line.separator");
			 String link="https://neu-csye6225-spring2017-team-3.com/reset/?id="+id+"";
			String BODY = "Forgot Your Password?"+newline+link;
			AWSPostMan postman= new AWSPostMan();
			postman.sendmail(FROM, TO, BODY, SUBJECT);
			 return "resetnotify";
		}
		else{
			
			model.put("errormessage","No such user exists, try another email");
			return "login";
		}
}
		
		
	
	@RequestMapping(value="/reset", method=RequestMethod.GET)
	public String reset(@RequestParam("id") String id,HttpSession session)
	{
       String email=forgetService.checkticket(id).getEmail();
		long time=forgetService.checkticket(id).getTime();
		long currtime= System.currentTimeMillis();
		long dif= currtime-time;
		if(dif>3600000){
			forgetService.removeticket(id);
			return "resettimeout";
		}
		else{
			session.setAttribute("email", email);
		return "resetpassword";
		}
	}
	@RequestMapping(value="/performreset", method=RequestMethod.POST)
	public String performreset(@RequestParam("passw") String password,HttpSession session,ModelMap model)
	{
        String email=session.getAttribute("email").toString();
		registerService.updatepassword(email,password);
		session.invalidate();
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

