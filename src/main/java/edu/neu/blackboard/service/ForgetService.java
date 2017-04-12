package edu.neu.blackboard.service;

import edu.neu.blackboard.dao.resetobj;
import edu.neu.blackboard.domain.Users;

public interface ForgetService {
	public void addticket(String email, long time, String id);

	public resetobj checkticket(String id);

	public void removeticket(String id);

	public void removeticket2(String email);

	public long checkpresent(String id);
}
