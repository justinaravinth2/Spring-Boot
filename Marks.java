package com.javatpoint.server.main.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="marks")
public class Marks {
	
	@Id
	private int marks_id;
	private int tamil;
	private int english;
	private int maths;
	private int total;
	
	public int getMarks_id() {
		return marks_id;
	}
	public void setMarks_id(int marks_id) {
		this.marks_id = marks_id;
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
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
		
}
