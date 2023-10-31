package com.javatpoint.server.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aravinth")
public class College {
	
	@Id
	private int college_id;
	private String college_name;
	public int getCollege_id() {
		return college_id;
	}
	public void setCollege_id(int college_id) {
		this.college_id = college_id;
	}
	public String getCollege_name() {
		return college_name;
	}
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	@Override
	public String toString() {
		return "College [college_id=" + college_id + ", college_name=" + college_name + "]";
	}
	public College(int college_id, String college_name) {
		super();
		this.college_id = college_id;
		this.college_name = college_name;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
