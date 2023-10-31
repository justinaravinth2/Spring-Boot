package com.javatpoint.server.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tes")
@Entity
public class Test {
	
	@Id
	private int p_id;
	
	private String p_name;

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	@Override
	public String toString() {
		return "Test [p_id=" + p_id + ", p_name=" + p_name + "]";
	}

	public Test(int p_id, String p_name) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
	}

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
