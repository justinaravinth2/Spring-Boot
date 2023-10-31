package com.javatpoint.server.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="av1",sequenceName = "avg_seq",initialValue = 1,allocationSize = 1)
@Table(name="average_table")
public class Average {
	
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "av1")
	private int average_id;
	private  String student_name;
	private int tamil;
	private int english;
	private int maths;
	private int science;
	private int social;
	private int total;
	private double average;
	public int getAverage_id() {
		return average_id;
	}
	public void setAverage_id(int average_id) {
		this.average_id = average_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getTamil() {
		return tamil;
	}
	public void setTamil(int tamil) {
		this.tamil = tamil;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getSocial() {
		return social;
	}
	public void setSocial(int social) {
		this.social = social;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	
	
	@Override
	public String toString() {
		return "Average [average_id=" + average_id + ", student_name=" + student_name + ", tamil=" + tamil
				+ ", english=" + english + ", maths=" + maths + ", science=" + science + ", social=" + social
				+ ", total=" + total + ", average=" + average + "]";
	}
	public Average(int average_id, String student_name, int tamil, int english, int maths, int science, int social,
			int total, double average) {
		super();
		this.average_id = average_id;
		this.student_name = student_name;
		this.tamil = tamil;
		this.english = english;
		this.maths = maths;
		this.science = science;
		this.social = social;
		this.total = total;
		this.average = average;
		
	}
	public Average() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
