package edu.neu.blackboard.service;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.neu.blackboard.dao.*;
import edu.neu.blackboard.domain.*;
@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	@Qualifier("itemHibernateDAOImpl")
	private ItemDAO itemDAO;
	
	@Override
	@Transactional
	public void addItems(Items item) {
		itemDAO.addItems(item);
	}

	@Override
	@Transactional
	public Collection<Items> listItems() {
		return itemDAO.listItems();
	}

	@Override
	@Transactional
	public Collection<Items> finditem(String masalaname) {
		return itemDAO.finditem(masalaname);
		
	}

	@Override
	public Items find(String itemname) {
		
		return itemDAO.find(itemname);
	}

	@Override
	public void updatequantity(String itemname, int quantity) {
		// TODO Auto-generated method stub
		itemDAO.updatequantity(itemname,quantity);
	}

	/*@Override
	public void addorder(String email, String itemname, int quantity, String address) {
	itemDAO.addorder(email,itemname,quantity,address);
		
	}*/
}
