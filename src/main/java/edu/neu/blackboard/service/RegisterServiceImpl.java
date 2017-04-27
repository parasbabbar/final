package edu.neu.blackboard.service;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.neu.blackboard.dao.*;
import edu.neu.blackboard.domain.*;


@Service
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	@Qualifier("registerHibernateDAOImpl")
	private RegisterDAO registerDAO;
	
	@Override
	@Transactional
	public void addUsers(Users user) {
		registerDAO.addUsers(user);
	}

	@Override
	@Transactional
	public Collection<Users> listUsers() {
		return registerDAO.listUsers();
	}

	@Override
	@Transactional

	public void updatepassword(String email, String password) {
		// TODO Auto-generated method stub
		registerDAO.updatepassword(email,password);
		
	}

	@Override
	@Transactional

	public void addUsers(String email, String password, String username, String address) {
		// TODO Auto-generated method stub
registerDAO.addUsers(email,password,username,address);		
	}

}
