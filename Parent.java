package com.javatpoint.server.main.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "parent")
public class Parent {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int p_id;
	
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="parent_id",referencedColumnName = "p_id")
	private List<Child>child=new ArrayList<>();
	

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Child> getChild() {
		return child;
	}

	public void setChild(List<Child> child) {
		this.child = child;
	}
	
	

}
