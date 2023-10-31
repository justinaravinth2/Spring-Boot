package com.javatpoint.server.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="s1",sequenceName = "se1",initialValue = 1,allocationSize = 1)
@Table(name="rat")
public class Rat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "s1")
	private int r_id;
	private String r_name;
	private String r_mobile;
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public String getR_mobile() {
		return r_mobile;
	}
	public void setR_mobile(String r_mobile) {
		this.r_mobile = r_mobile;
	}
	@Override
	public String toString() {
		return "Rat [r_id=" + r_id + ", r_name=" + r_name + ", r_mobile=" + r_mobile + "]";
	}
	public Rat(int r_id, String r_name, String r_mobile) {
		super();
		this.r_id = r_id;
		this.r_name = r_name;
		this.r_mobile = r_mobile;
	}
	public Rat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
