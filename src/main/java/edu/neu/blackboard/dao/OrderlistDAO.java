package edu.neu.blackboard.dao;
import java.util.Collection;

import edu.neu.blackboard.domain.*;
public interface OrderlistDAO {
public void addorder(String email,String itemname,int quantity,String address,long Subtotal);
public Collection<Orderlist> show();
}
