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
@Table(name="Item")
public class Items {
	@Id
	@Column(name="ID")
	@GeneratedValue
	private Long id;
	
		
		@NotEmpty
		private String itemname;
		
		@NotEmpty
		@Column(name="itemdescription")
		private String itemdescription;
		
	
		@NotEmpty
		private String itemloc;
		@NotNull
		@Column(name="quantity")
		private Long quantity;
		@NotNull
		@Column(name="itemcost")
		private Long itemcost;
		
		
		public String getItemdescription() {
			return itemdescription;
		}
		public void setItemdescription(String itemdescription) {
			this.itemdescription = itemdescription;
		}

		public String getItemname(){
			return itemname;
		}
		public void setItemname(String itemname){
			this.itemname=itemname;
		}
		public String getItemloc(){
			return itemloc;
		}
		public void setItemloc(String itemloc){
			this.itemloc=itemloc;
		}
		public Long getQuantity() {
			return quantity;
		}
		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}
		public Long getItemcost() {
			return itemcost;
		}
		public void setItemcost(Long itemcost) {
			this.itemcost = itemcost;
		}

		public Long assignId() {
			this.id = idSequence.incrementAndGet();
			return id;
		}
		
		private static final AtomicLong idSequence = new AtomicLong();

}


