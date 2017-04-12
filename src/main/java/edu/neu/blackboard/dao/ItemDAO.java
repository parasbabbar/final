package edu.neu.blackboard.dao;
import java.util.Collection;

import edu.neu.blackboard.domain.*;
public interface ItemDAO {
	public void addItems(Items item);
	public Collection<Items> listItems();
	public Collection<Items> finditem(String masalaname);
    public Items find(String itemname);
	//public void addorder(String email, String itemname, int quantity, String address);
	public void updatequantity(String itemname, int quantity);
}
