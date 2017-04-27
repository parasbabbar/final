package edu.neu.blackboard.service;

import edu.neu.blackboard.dao.resetobj;
import edu.neu.blackboard.dao.verifyobj;
import edu.neu.blackboard.domain.*;

public interface VerifyService {
	public void addticket(Users user,String id);

	public verifyobj checkticket(String id);

	public void removeticket(String id);

	public long checkpresent(String id);

	public long checkticket2(String email);

	public void removeticket2(String email);

}
