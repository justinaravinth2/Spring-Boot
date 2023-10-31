package com.javatpoint.server.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity

@SequenceGenerator(name="s1",sequenceName = "jeni",initialValue = 1,allocationSize = 1)
@Table(name="user1")
public class User1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="s1" )
	private int user_id;
	
	private String uname;
	private String email;
	private String password;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
