package edu.neu.blackboard.service;
import java.util.Collection;

import edu.neu.blackboard.domain.*;

public interface OrderlistService {
public void addorder(String email,String itemname,int quantity,String address,long Subtotal);

public Collection<Orderlist> show();
}
