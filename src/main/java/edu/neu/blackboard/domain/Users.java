package edu.neu.blackboard.domain;
import java.util.concurrent.atomic.AtomicLong;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;



	@Entity
	@Table(name="User")

public class Users {
		

		@Id
		@Column(name="ID")
		@GeneratedValue
		private Long id;
		
		@NotEmpty
		private String userName;
		
		@NotEmpty
		
		@Column(unique = true)
		private String email;
		@NotEmpty
		private String password;
		@NotEmpty
		private String address;
		
		
		public String getPassword(){
			return password;
		}
		public void setPassword(String password){
			this.password=password;
		}
		public String getAddress(){
			return address;
		}
		public void setAddress(String address){
			this.address=address;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public Long assignId() {
			this.id = idSequence.incrementAndGet();
			return id;
		}
		
		private static final AtomicLong idSequence = new AtomicLong();

}
