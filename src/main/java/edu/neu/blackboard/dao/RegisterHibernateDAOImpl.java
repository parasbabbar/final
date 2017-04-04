package edu.neu.blackboard.dao;
import java.util.Collection;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.neu.blackboard.domain.*;

@Repository	



public class RegisterHibernateDAOImpl implements RegisterDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addUsers(Users user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public Collection<Users> listUsers() {
		return sessionFactory.getCurrentSession().createQuery("from Users").list();
	}

	@Override
	public void updatepassword(String email, String password) {
		// TODO Auto-generated method stub
		Query query=sessionFactory.getCurrentSession().createQuery("from Users as r where r.email='" + email + "'");
		/*query.setParameter(0,user.getEmail());
		query.setParameter(1,user.getPassword());
		*/
	 Users us= (Users)query.uniqueResult();
	 us.getAddress();
	 us.getEmail();
	 us.setPassword(password);
		sessionFactory.getCurrentSession().update(us);


	}

}
