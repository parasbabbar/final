package edu.neu.blackboard.web;

import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import edu.neu.blackboard.domain.*;
import edu.neu.blackboard.service.LoginService;
import edu.neu.blackboard.service.RegisterService;
import edu.neu.blackboard.service.VerifyService;

@Controller
@SessionAttributes("")
@RequestMapping("/register")
public class StudentController {
	@Autowired
	private RegisterService registerService;
	
	@Autowired
	private LoginService loginService;
	
	@Autowired 
	private VerifyService verifyService;
	
	@RequestMapping(method=RequestMethod.POST)
	public String addUsers(@Valid Users user, BindingResult bindingResult,HttpSession session,ModelMap model) throws IOException {
		if (bindingResult.hasErrors()) {
			return "register";
		}
		
		else{
			if(user.getEmail().contains("<script>")||user.getEmail().contains("'")||user.getEmail().contains("=")||user.getEmail().contains("<")||user.getEmail().contains(">")){
				
				model.put("cheat", "Dont try to hack the system you will get caught, valid inputs are allowed");
						return "register";
			}
			
			else if(user.getAddress().contains("<script>")||user.getAddress().contains("'")||user.getAddress().contains("=")||user.getAddress().contains("<")||user.getAddress().contains(">")){
				model.put("cheat", "Dont try to hack the system you will get caught, valid inputs are allowed");
						return "register";
			}
			
			else if(user.getPassword().contains("<script>")||user.getPassword().contains("'")||user.getPassword().contains("=")||user.getPassword().contains("<")||user.getPassword().contains(">")){
				model.put("cheat", "Dont try to hack the system you will get caught,valid inputs are allowed");
						return "register";
			}
			else if(user.getUserName().contains("<script>")||user.getUserName().contains("'")||user.getUserName().contains("=")||user.getUserName().contains("<")||user.getUserName().contains(">")){
				model.put("cheat", "Dont try to hack the system you will get caught,valid inputs are allowed");
						return "register";
			}
			
			
			
			else{
				long count1=loginService.checkticket2(user.getEmail());
			if(count1!=0){
				
				model.put("regerrormessage","User already present Sign up using a new user or logging in");
				
				return "register";
			}
			
			else{
				long count=verifyService.checkticket2(user.getEmail());
				 if(count!=0){
					 verifyService.removeticket2(user.getEmail());
				 }SecureRandom random = new SecureRandom();  
				   String id= new BigInteger(130, random).toString(32);
				verifyService.addticket(user, id);
				String FROM = "Verify@neu-csye6225-spring2017-team-3.com"; 
				String TO = user.getEmail();
				String SUBJECT = "Verify Yourself by clicking the link";
				 String newline = System.getProperty("line.separator");
				 String link="52.53.174.203:8080/project-1.0.0-BUILD-SNAPSHOT/verify/?verid="+id+"";
				String BODY = "Verify yourself by clicking to this link"+newline+link;
				AWSPostMan postman= new AWSPostMan();
				postman.sendmail(FROM, TO, BODY, SUBJECT);
				
				
		
		return "redirect:notifyverify";}
				 
		}}}
	
	@RequestMapping(method=RequestMethod.GET)
	public String listUsers(Model model) {
		return "register";
	}
}
