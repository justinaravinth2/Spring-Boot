package com.javatpoint.server.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="cars")
@SequenceGenerator(name="ca",sequenceName = "crs",initialValue = 1,allocationSize = 1)
public class Cars {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ca")
	private int c_no;
	private String c_name;
	private String model;
	public int getC_no() {
		return c_no;
	}
	public void setC_no(int c_no) {
		this.c_no = c_no;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Cars [c_no=" + c_no + ", c_name=" + c_name + ", model=" + model + "]";
	}
	public Cars(int c_no, String c_name, String model) {
		super();
		this.c_no = c_no;
		this.c_name = c_name;
		this.model = model;
	}
	public Cars() {
		super();
		// TODO Auto-generated constructor stub
	}
		

}
