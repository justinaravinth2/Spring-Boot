package com.javatpoint.server.main.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	
	@Id
	private int course_id;
	
	private String course_name;
	
	@ManyToMany(mappedBy = "course",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Student>student=new HashSet<>();

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	
	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public Course(int course_id, String course_name) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
