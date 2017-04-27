package edu.neu.blackboard.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.neu.blackboard.dao.*;
import edu.neu.blackboard.domain.*;
@Service
public class VerifyServiceImpl implements VerifyService {
	@Autowired
	private VerifyDAO verifyDAO;
	@Override
	@Transactional
	public void addticket(Users user, String id) {
		// TODO Auto-generated method stub
		verifyDAO.addticket(user,id);		
	}
	@Override
	@Transactional
	public verifyobj checkticket(String id) {
		// TODO Auto-generated method stub
		return verifyDAO.checkticket(id);
	}
	@Override
	@Transactional

	public void removeticket(String id) {
		// TODO Auto-generated method stub
		verifyDAO.removeticket(id);
	}
	@Override
	@Transactional
	public long checkpresent(String id) {
		// TODO Auto-generated method stub
		return verifyDAO.checkpresent(id);
	}
	@Override
	@Transactional
	public long checkticket2(String email) {
		// TODO Auto-generated method stub
		return verifyDAO.checkticket2(email);
	}
	@Override
	@Transactional
	public void removeticket2(String email) {
		// TODO Auto-generated method stub
		verifyDAO.removeticket2(email);
	}
}