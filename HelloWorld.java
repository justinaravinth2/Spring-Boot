package com.javatpoint.server.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hellowrodl")
public class HelloWorld {
	@Id
	
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "HelloWorld [ message=" + message + "]";
	}
	public HelloWorld(String message) {
		super();
		this.message = message;
	}
	public HelloWorld() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
