package edu.neu.blackboard.service;
import java.util.Collection;

import edu.neu.blackboard.domain.*;



public interface RegisterService {
	public void addUsers(Users user);
	public Collection<Users> listUsers();
	public void updatepassword(String email, String password);

}
