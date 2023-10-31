package com.javatpoint.server.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="scores")
public class Scores {
	
	@Id
	private int mno;
	private String subject;
	private int marks;
	private int sno;
	@ManyToOne(targetEntity=Boys.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="sno")	
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public Scores(int mno, String subject, int marks, int sno) {
		super();
		this.mno = mno;
		this.subject = subject;
		this.marks = marks;
		this.sno = sno;
		
	}
	public Scores() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
