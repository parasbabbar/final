package edu.neu.blackboard.domain;
import java.util.concurrent.atomic.AtomicLong;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="Forgot")

public class Forgot {
			

			@Id
			@Column(name="id")
			private String id;
			@Column(name="Time")
			private long time;
			
			public String getId() {
				return id;
			}
			public void setId(String id) {
				this.id = id;
			}
			public long getTime() {
				return time;
			}
			public void setTime(long time) {
				this.time = time;
			}
			@Column(name="Email")
			private String email;
			
			
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			
	}

