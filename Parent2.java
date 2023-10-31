package com.javatpoint.server.main.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="parent2")
public class Parent2 {
	
	@Id
	private int p_id;
	
	private String first_name;
	private String second_name;
	private int mobile_no;
	
	@ManyToMany(cascade =CascadeType.ALL)
	@JoinTable(name="parent_child2",
	joinColumns = @JoinColumn(name="p_id"),
	inverseJoinColumns = @JoinColumn(name="c_id"))
	Set<Child2>child2=new HashSet<Child2>();

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getSecond_name() {
		return second_name;
	}

	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}

	public int getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}

	public Set<Child2> getChild2() {
		return child2;
	}

	public void setChild2(Set<Child2> child2) {
		this.child2 = child2;
	}

	@Override
	public String toString() {
		return "Parent2 [p_id=" + p_id + ", first_name=" + first_name + ", second_name=" + second_name + ", mobile_no="
				+ mobile_no + "]";
	}

	public Parent2(int p_id, String first_name, String second_name, int mobile_no, Set<Child2> child2) {
		super();
		this.p_id = p_id;
		this.first_name = first_name;
		this.second_name = second_name;
		this.mobile_no = mobile_no;
		this.child2 = child2;
	}

	public Parent2() {
		super();
		
	}	

}