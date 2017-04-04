package edu.neu.blackboard.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.neu.blackboard.domain.Forgot;
@Repository
public class ForgetHibernateDAOImpl implements ForgetDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void addticket(String email, long time, String id) {
   
    Forgot forg= new Forgot();
    forg.setEmail(email);
    forg.setTime(time);
    forg.setId(id);
    sessionFactory.getCurrentSession().save(forg);	
	}

	@Override
	public resetobj checkticket(String id) {
		// TODO Auto-generated method stub
		List<Forgot> forg=sessionFactory.getCurrentSession().createQuery("from Forgot i where i.id = '" + id + "'").list();
		String email=forg.get(0).getEmail();
		Long time=forg.get(0).getTime();
	resetobj re = new resetobj();
	re.setEmail(email);
	re.setTime(time);
	return re;}

	@Override
	public void removeticket(String id) {
		// TODO Auto-generated method stub
		Query query = sessionFactory.getCurrentSession().createQuery("delete Forgot where id = :ID");
		query.setParameter("ID", id);
		 
	 query.executeUpdate();
		
	}

	@Override
	public void ch(Forgot forg) {
		// TODO Auto-generated method stub
		
	}

}
