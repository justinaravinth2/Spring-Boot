package com.javatpoint.server.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="books")
public class Books {
	
	@Id
	private int b_id;
	
	private int b_name;

	private int lib_id;

	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public int getB_name() {
		return b_name;
	}

	public void setB_name(int b_name) {
		this.b_name = b_name;
	}

	public int getLib_id() {
		return lib_id;
	}

	public void setLib_id(int lib_id) {
		this.lib_id = lib_id;
	}

	

}
