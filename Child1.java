package com.javatpoint.server.main.model;




import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="child1")
public class Child1 {
	@Id
	private int c_id;
	
	private String c_name;
	
	@ManyToOne(cascade =CascadeType.ALL )
	@JoinColumn(name="parent1_id",referencedColumnName = "p_id")
	private Parent1 parent1;

	public Parent1 getParent1() {
		return parent1;
	}

	public void setParent1(Parent1 parent1) {
		this.parent1 = parent1;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}


	
	

}
