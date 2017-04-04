package edu.neu.blackboard.web;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import edu.neu.blackboard.domain.*;
import edu.neu.blackboard.service.RegisterService;

@Controller
@SessionAttributes("")
@RequestMapping("/register")
public class StudentController {
	@Autowired
	private RegisterService registerService;
	
	
	@RequestMapping(method=RequestMethod.POST)
	public String addUsers(@Valid Users user, BindingResult bindingResult,HttpSession session) {
		if (bindingResult.hasErrors()) {
			return "register";
		}
		else{
		registerService.addUsers(user);
		
		
		session.setAttribute("name",user.getUserName());
		session.setAttribute("email",user.getEmail());
		session.setAttribute("address",user.getAddress());
		
		return "redirect:home";
		}}
	
	@RequestMapping(method=RequestMethod.GET)
	public String listUsers(Model model) {
		return "register";
	}
}
