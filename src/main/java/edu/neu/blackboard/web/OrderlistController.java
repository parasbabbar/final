package edu.neu.blackboard.web;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.neu.blackboard.domain.*;
import edu.neu.blackboard.service.*;
import java.util.*;
@Controller

public class OrderlistController {
@Autowired
private OrderlistService orderlistService;

@Autowired
private ItemService itemService;

@Autowired 
private LoginService loginService;
@RequestMapping(value="/placeorder/{s}",method=RequestMethod.GET)
public String placeorder(@PathVariable(value="s") String totalcost,HttpSession session,ModelMap model)
{if(session.getAttribute("email")==null){
	model.put("errormessage", "Need to login for placing order");
	return"login";
}
else{
		List<Order> cart =(List<Order>)session.getAttribute("cart");
	for(int i=0;i<cart.size();i++){
		String address=session.getAttribute("address").toString();
		String email=session.getAttribute("email").toString();
		String itemname=cart.get(i).getI().getItemname();
		int quantity=cart.get(i).getQuantity();
		Long cost= cart.get(i).getI().getItemcost();
		long Subtotal=cost*quantity;
		
		
		orderlistService.addorder(email,itemname,quantity,address,Subtotal);
	itemService.updatequantity(itemname,quantity);
	
	}
	//loginService.increasetotalcost(totalcost,session.getAttribute("email").toString());
	model.put("totalcost", totalcost);
	return "placeorder";
}

}
@RequestMapping(value="/orderlist",method=RequestMethod.GET)
public String orderlist(Model model){
    model.addAttribute(new Orderlist());
	model.addAttribute("orderlist", orderlistService.show());
return "orderlist";
}
@RequestMapping(value="/cont",method=RequestMethod.GET)
public String cont(Model model,HttpSession session){
	List<Order> cart = new ArrayList<Order>();
	session.setAttribute("cart", cart);

	return "redirect:home";
}

}
