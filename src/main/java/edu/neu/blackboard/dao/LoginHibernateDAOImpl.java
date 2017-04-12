package edu.neu.blackboard.dao;


import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Repository;

import edu.neu.blackboard.domain.*;
@Repository	
public class LoginHibernateDAOImpl implements LoginDAO{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Users validateUser(Users user) {
		Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    Criteria criteria = session.createCriteria(Users.class);
	    criteria.add(Restrictions.eq("email", user.getEmail()));
	    criteria.setProjection(Projections.rowCount());
	    long count = (Long) criteria.uniqueResult();
	    session.getTransaction().commit();
		
		
		if(count!=0){
		Query query=sessionFactory.getCurrentSession().createQuery("from Users as r where r.email='" + user.getEmail() + "'");
		Users users = (Users)query.uniqueResult();
		boolean b=BCrypt.checkpw(user.getPassword(), users.getPassword());
		if(b){session.close();

	return (Users)query.uniqueResult();}
		else{session.close();	

			return null;
		}}
		else{session.close();	

			return null;
		}
	}

	@Override
	public Collection<Users> list() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Users").list();
	}

	@Override
	public void increasetotalcost(String totalcost,String email) {
		
		
	}
	@Override
public Users checkuser(Users user) {
		Query query=sessionFactory.getCurrentSession().createQuery("from Users as r where r.email='" + user.getEmail() + "'");
		/*query.setParameter(0,user.getEmail());
		query.setParameter(1,user.getPassword());
		*/
	return (Users)query.uniqueResult();
	}
	@Override
	public long checkticket2(String email) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    Criteria criteria = session.createCriteria(Users.class);
	    criteria.add(Restrictions.eq("email", email));
	    criteria.setProjection(Projections.rowCount());
	    long count = (Long) criteria.uniqueResult();
	    session.getTransaction().commit();
session.close();
	    return count;
		
	}
}

