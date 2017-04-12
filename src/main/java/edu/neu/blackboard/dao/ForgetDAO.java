package edu.neu.blackboard.dao;
import java.util.Collection;

import edu.neu.blackboard.domain.*;



public interface ForgetDAO {
	public void ch(Forgot forg);
	public void addticket(String email, long time, String id);

	public resetobj checkticket(String id);

	public void removeticket(String id);
	public void removeticket2(String email);
	public long checkpresent(String id);

}
