package edu.neu.blackboard.dao;

import java.util.Collection;

import edu.neu.blackboard.domain.*;

public interface RegisterDAO {
	public void addUsers(Users user);
	public Collection<Users> listUsers();
	public void updatepassword(String email, String password);
	public void addUsers(String email, String password, String username, String address);
}
