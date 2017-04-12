package edu.neu.blackboard.web;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.neu.blackboard.domain.*;
import edu.neu.blackboard.service.*;
@Controller
public class ItemController {
@Autowired
private ItemService itemService;
@RequestMapping(value="/additem",method=RequestMethod.POST)
public String addItems(@Valid Items item, BindingResult bindingResult,ModelMap model) {
	if (bindingResult.hasErrors()) {
		model.put("errormessage", "incomplete add");
		return "manage";
	}
	else{
	itemService.addItems(item);
	
	return "manage";
	}}
@RequestMapping(value="/home", method=RequestMethod.GET)
public String home(Model model){
	model.addAttribute(new Items());
	model.addAttribute("itemlist",itemService.listItems());
	return"home";
}
@RequestMapping(value="/items/{itemname}", method=RequestMethod.GET)
public String display(@PathVariable("itemname") String itemname,Model model){
	String masalaname=itemname;
	
	model.addAttribute(new Items());
	model.addAttribute("itemlist",itemService.finditem(masalaname));
	
	return"itemdisplay";
}


}
