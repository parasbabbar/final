package edu.neu.blackboard.dao;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.Collection;
import edu.neu.blackboard.domain.*;
@Repository	
public class OrderlistHibernateDAOImpl implements OrderlistDAO{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addorder(String email, String itemname, int quantity, String address, long Subtotal) {
		 Orderlist ol= new Orderlist();
		 ol.setAddress(address);
		 ol.setEmail(email);
		 ol.setItemname(itemname);
		 ol.setQuantity(quantity);
		 ol.setSubtotal(Subtotal);
	        sessionFactory.getCurrentSession().save(ol);
	        	
	}

	@Override
	public Collection<Orderlist> show() {
		
		return sessionFactory.getCurrentSession().createQuery("from Orderlist").list();
	}

}
