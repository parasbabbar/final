package edu.neu.blackboard.service;
import java.util.Collection;

import edu.neu.blackboard.domain.*;

public interface LoginService {
	public Users validateUser(Users user);

	public Collection<Users> list();

	public void increasetotalcost(String totalcost, String string);

	public Users checkuser(Users user);

	long checkticket2(String email);
}
