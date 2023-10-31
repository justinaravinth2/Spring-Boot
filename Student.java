package com.javatpoint.server.main.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	private int roll_no;
	
	private String student_name;
	private int age;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name="student_course",
	joinColumns= {@JoinColumn(name="roll_no")},
	inverseJoinColumns = {@JoinColumn(name="course_id",referencedColumnName = "course_id")})
	Set<Course>course=new HashSet<>();

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	

	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}

	public Student(int roll_no, String student_name, int age, Set<Course> course) {
		super();
		this.roll_no = roll_no;
		this.student_name = student_name;
		this.age = age;
		this.course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}