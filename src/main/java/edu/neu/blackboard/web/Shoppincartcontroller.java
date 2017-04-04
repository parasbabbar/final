package edu.neu.blackboard.web;
import javax.servlet.http.HttpServletRequest;
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
import org.springframework.web.multipart.*;

import java.io.BufferedOutputStream;
import java.io.File;
import java.util.*;
@Controller

public class Shoppincartcontroller {
	@Autowired
	private ItemService itemService;
@RequestMapping(value="/addtocart/{itemname}",method=RequestMethod.GET)
public String ordernow(@PathVariable(value="itemname") String itemname,HttpSession session)
	{
if(session.getAttribute("cart")== null){
	List<Order> cart = new ArrayList<Order>();
	cart.add(new Order(itemService.find(itemname),1));
	session.setAttribute("cart", cart);
}
else{
	List<Order> cart =(List<Order>)session.getAttribute("cart") ;
	int index= isExisting(itemname,session);
	if(index== -1){
		cart.add(new Order(itemService.find(itemname),1));	
	}
	else{
		int quantity =cart.get(index).getQuantity() + 1;
		cart.get(index).setQuantity(quantity);
	}
	session.setAttribute("cart", cart);

}
		return"cart";

	
}

@RequestMapping(value="/delete/{itemname}",method=RequestMethod.GET)
public String delete(@PathVariable(value="itemname") String itemname,HttpSession session)
	{List<Order> cart =(List<Order>)session.getAttribute("cart") ;
	int index= isExisting(itemname,session);
	cart.remove(index);
	session.setAttribute("cart", cart);
	return "cart";
	}

private int isExisting(String itemname,HttpSession session){
	List<Order> cart =(List<Order>)session.getAttribute("cart") ;
	
	for(int i=0;i<cart.size();i++){
		
		if(cart.get(i).getI().getItemname().equalsIgnoreCase(itemname)){
		
			return i;}
		
	}
return -1;
		
		
}
}
