package edu.neu.blackboard.service;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.neu.blackboard.dao.*;
import edu.neu.blackboard.domain.*;
@Service
public class OrderlistServiceImpl implements OrderlistService {
	@Autowired
	@Qualifier("orderlistHibernateDAOImpl")
	private OrderlistDAO orderlistDAO;
	
	@Override
	@Transactional
	public void addorder(String email,String itemname,int quantity,String address,long Subtotal) {
		orderlistDAO.addorder(email,itemname,quantity,address,Subtotal);
	}
	@Override
	@Transactional
	public Collection<Orderlist> show(){
		return orderlistDAO.show();
	}
}
