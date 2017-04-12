package edu.neu.blackboard.domain;

public class Order {
private Items i= new Items();
private int quantity;
public Order(Items i, int quantity) {
	super();
	this.i = i;
	this.quantity = quantity;
}
public Order() {
	super();
	// TODO Auto-generated constructor stub
}
public Items getI() {
	return i;
}
public void setI(Items i) {
	this.i = i;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
}
