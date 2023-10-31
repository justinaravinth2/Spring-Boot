package com.javatpoint.server.main.model;
import javax.persistence.*;

@Entity
@Table(name = "child")
public class Child {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int c_id;
	
	private String name;
	
	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	

}
