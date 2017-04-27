package edu.neu.blackboard.dao;
import java.util.Collection;

import edu.neu.blackboard.domain.*;



public interface VerifyDAO {
	public void addticket(Users user,String id);

	public verifyobj checkticket(String id);

	public void removeticket(String id);

	public long checkpresent(String id);

	public long checkticket2(String email);

	public void removeticket2(String email);
}
