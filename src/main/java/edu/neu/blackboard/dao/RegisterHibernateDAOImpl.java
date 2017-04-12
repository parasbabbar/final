package edu.neu.blackboard.dao;
import java.util.Collection;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
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
		
	 Users us2= (Users)query.uniqueResult();
	 
		Session s=sessionFactory.openSession();
		Transaction tx3 = s.beginTransaction();
		Users u= new Users();
		long id=us2.getId();
	 u.setId(id);
	 String hp=BCrypt.hashpw(password, BCrypt.gensalt());
	    
	 u.setPassword(hp);
	 u.setEmail(email);
	 u.setAddress( us2.getAddress());
	 u.setUserName(us2.getUserName());
	 s.update(u);
		//sessionFactory.getCurrentSession().update(us2);
tx3.commit();
s.close();
	}

	@Override
	public void addUsers(String email, String password, String username, String address) {
		// TODO Auto-generated method stub
		Session s=sessionFactory.openSession();
		Transaction tx=s.beginTransaction();
	    Users usr= new Users();
	    usr.setEmail(email);
	    usr.setPassword(password);
	    usr.setAddress(address);
	    usr.setUserName(username);
	    s.save(usr);
	    tx.commit();
		s.close();
	}

}
