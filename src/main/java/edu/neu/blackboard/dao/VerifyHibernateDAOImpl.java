package edu.neu.blackboard.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.security.crypto.bcrypt.*;
import edu.neu.blackboard.domain.*;
@Repository
public class VerifyHibernateDAOImpl implements VerifyDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void addticket(Users user, String id) {
	Session s=sessionFactory.openSession();
	Transaction tx=s.beginTransaction();
    Verify ver= new Verify();
    ver.setEmail(user.getEmail());
    ver.setId(id);
    String hp=BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
    ver.setAddress(user.getAddress());
    ver.setPassword(hp);
    ver.setUserName(user.getUserName());
    s.save(ver);
    tx.commit();
    s.close();
	}
	@Override
	public verifyobj checkticket(String id) {
		// TODO Auto-generated method stub
		List<Verify> forg=sessionFactory.getCurrentSession().createQuery("from Verify i where i.id = '" + id + "'").list();
		String email=forg.get(0).getEmail();
		
		String password=forg.get(0).getPassword();
		String address=forg.get(0).getAddress();
		String username=forg.get(0).getUserName();
	verifyobj re = new verifyobj();
	re.setAddress(address);
	re.setPassword(password);
	re.setUserName(username);
	re.setEmail(email);
	return re;
	}
	@Override
	public void removeticket(String id) {
		// TODO Auto-generated method stub
		Query query = sessionFactory.getCurrentSession().createQuery("delete Verify where id = :ID");
		query.setParameter("ID", id);
		 
	 query.executeUpdate();
		

	}
	@Override
	public long checkpresent(String id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		    session.beginTransaction();
		    Criteria criteria = session.createCriteria(Verify.class);
		    criteria.add(Restrictions.eq("id", id));
		    criteria.setProjection(Projections.rowCount());
		    long count = (Long) criteria.uniqueResult();
		    session.getTransaction().commit();
	session.close();
		    
		    return count;	   
		
	}
	@Override
	public long checkticket2(String email) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    Criteria criteria = session.createCriteria(Verify.class);
	    criteria.add(Restrictions.eq("email", email));
	    criteria.setProjection(Projections.rowCount());
	    long count = (Long) criteria.uniqueResult();
	    session.getTransaction().commit();
session.close();
	    return count;
		
	}
	@Override
	public void removeticket2(String email) {
		// TODO Auto-generated method stub
		Query query = sessionFactory.getCurrentSession().createQuery("delete Verify where email = :ID");
		query.setParameter("ID", email);
		 
	 query.executeUpdate();
	}
}
