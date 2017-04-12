package edu.neu.blackboard.dao;
import java.util.Collection;

import edu.neu.blackboard.domain.*;
public interface LoginDAO {
	

	public Users validateUser(Users user);

	public Collection<Users> list();

	public void increasetotalcost(String totalcost, String email);
	
	public Users checkuser(Users user);

	long checkticket2(String email);
}
