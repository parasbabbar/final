package edu.neu.blackboard.dao;
import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.neu.blackboard.domain.*;
@Repository
public class ItemHibernateDAOImpl implements ItemDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addItems(Items item) {
		sessionFactory.getCurrentSession().save(item);
	}

	@Override
	public Collection<Items> listItems() {
		
		return sessionFactory.getCurrentSession().createQuery("from Items").list();
	}

	@Override
	public Collection<Items> finditem(String masalaname) {
		return sessionFactory.getCurrentSession().createQuery("from Items i where i.itemname = '" + masalaname + "'").list();
	}

	@Override
	public Items find(String itemname) {
		Query query=sessionFactory.getCurrentSession().createQuery("from Items  r where r.itemname='" + itemname + "'");
		
		
	return (Items)query.uniqueResult();}

	@Override
	public void updatequantity(String itemname, int quantity) {
		List<Items> item=sessionFactory.getCurrentSession().createQuery("from Items i where i.itemname = '" + itemname + "'").list();
		Long iniquant=item.get(0).getQuantity();
		Long quant=iniquant-quantity;
		String hql = "UPDATE Items set quantity = :Quantity WHERE itemName = :itemName";

		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		

		query.setParameter("Quantity",quant);

		query.setParameter("itemName",itemname);

		int result = query.executeUpdate();
		
	}

	
}
