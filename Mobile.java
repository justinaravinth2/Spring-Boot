package com.javatpoint.server.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobile")
public class Mobile {

	@Id
	private int mobile_id;
	private String mobile_name;
	private String model;
	public int getMobile_id() {
		return mobile_id;
	}
	public void setMobile_id(int mobile_id) {
		this.mobile_id = mobile_id;
	}
	public String getMobile_name() {
		return mobile_name;
	}
	public void setMobile_name(String mobile_name) {
		this.mobile_name = mobile_name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Mobile(int mobile_id, String mobile_name, String model) {
		super();
		this.mobile_id = mobile_id;
		this.mobile_name = mobile_name;
		this.model = model;
	}
	@Override
	public String toString() {
		return "Mobile [mobile_id=" + mobile_id + ", mobile_name=" + mobile_name + ", model=" + model + "]";
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
