package com.javatpoint.server.main.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="child2")
public class Child2 {
	
	@Id
	private int c_id;
	private String name;
	private String address;
	
	@ManyToMany(mappedBy = "child2",cascade = CascadeType.ALL )
	private Set<Parent2> parent2=new HashSet<Parent2>();

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Parent2> getParent2() {
		return parent2;
	}

	public void setParent2(Set<Parent2> parent2) {
		this.parent2 = parent2;
	}

	@Override
	public String toString() {
		return "Child2 [c_id=" + c_id + ", name=" + name + ", address=" + address + ", parent2=" + parent2 + "]";
	}

	public Child2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

