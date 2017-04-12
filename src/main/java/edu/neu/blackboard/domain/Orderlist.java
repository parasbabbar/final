package edu.neu.blackboard.domain;

import java.util.concurrent.atomic.AtomicLong;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Orderlist")
public class Orderlist {
	@Id
	@Column(name="ID")
	@GeneratedValue
	private Long id;
	
	
	@NotEmpty
	@Column(name="email")
	private String email;
	
	
		@NotEmpty
		@Column(name="itemname")
		private String itemname;
		
		@NotNull
		@Column(name="quantity")
		private int quantity;
		@NotNull
		@Column(name="subtotal")
		private Long subtotal;
		@NotEmpty
		@Column(name="address")
		private String address;
		
		
		
		
		public String getItemname(){
			return itemname;
		}
		public void setItemname(String itemname){
			this.itemname=itemname;
		}
		
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity2) {
			this.quantity = quantity2;
		}
		public Long getSubtotal() {
			return subtotal;
		}
		public void setSubtotal(Long subtotal) {
			this.subtotal = subtotal;
		}

		public Long assignId() {
			this.id = idSequence.incrementAndGet();
			return id;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
	
		private static final AtomicLong idSequence = new AtomicLong();

}


