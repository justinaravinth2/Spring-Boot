package com.javatpoint.server.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="sample",initialValue = 1 ,allocationSize = 1)

@Table(name="stringkey")
public class Stringkey {
	
	@Id
	private int s_no;
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sample")
	private String s_id;
	
	private String s_name;

	public String getS_id() {
		return s_id;
	}

	public void setS_id(String s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public int getS_no() {
		return s_no;
	}

	public void setS_no(int s_no) {
		this.s_no = s_no;
	}

	@Override
	public String toString() {
		return "Stringkey [s_no=" + s_no + ", s_id=" + s_id + ", s_name=" + s_name + "]";
	}

	public Stringkey(int s_no, String s_id, String s_name) {
		super();
		this.s_no = s_no;
		this.s_id = s_id;
		this.s_name = s_name;
	}

	public Stringkey() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
