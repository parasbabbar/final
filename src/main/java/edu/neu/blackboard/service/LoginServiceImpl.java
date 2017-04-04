package edu.neu.blackboard.service;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.neu.blackboard.dao.*;
import edu.neu.blackboard.domain.*;
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	@Qualifier("loginHibernateDAOImpl")
	private LoginDAO loginDAO;

	@Override
	@Transactional
	public Users validateUser(Users user) {
		// TODO Auto-generated method stub
		return loginDAO.validateUser(user);
	}
	@Override
	@Transactional
	public String checkuser(String email) {
		// TODO Auto-generated method stub
		return loginDAO.checkuser(email);
	}

	@Override
	@Transactional
	public Collection<Users> list() {
		// TODO Auto-generated method stub
		return loginDAO.list();
	}

	@Override
	public void increasetotalcost(String totalcost,String email) {
		loginDAO.increasetotalcost(totalcost,email);
		
	}

	

	}
