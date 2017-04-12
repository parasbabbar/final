package edu.neu.blackboard.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.neu.blackboard.dao.*;
import edu.neu.blackboard.domain.*;
@Service
public class ForgetServiceImpl implements ForgetService {
	@Autowired
	private ForgetDAO foregetDAO;
	@Override
	@Transactional
	public void addticket(String email, long time, String id) {
		// TODO Auto-generated method stub
		foregetDAO.addticket(email, time, id);		
	}
	@Override
	@Transactional
	public resetobj checkticket(String id) {
		// TODO Auto-generated method stub
		
		return foregetDAO.checkticket(id); 
		
	}
	@Override
	@Transactional
	public void removeticket(String id) {
		// TODO Auto-generated method stub
		foregetDAO.removeticket(id);
		
	}
	@Override
	public void removeticket2(String email) {
		// TODO Auto-generated method stub
		foregetDAO.removeticket2(email);
		
	}
	@Override
	@Transactional
	public long checkpresent(String id) {
		// TODO Auto-generated method stub
		return foregetDAO.checkpresent(id);
	}
	

}
