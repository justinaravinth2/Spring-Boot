package com.javatpoint.server.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="students")
public class Students {
	
	@Id
	private int id;
	private String name;
	@OneToOne(targetEntity = Marks.class,cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="id")
	private Marks marks;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	
	
	
	
	

}
