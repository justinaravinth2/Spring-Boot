package com.javatpoint.server.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cycle")
public class Cycle {
	
	@Id
	private int cycle_id;
	private String cycle_name;
	
	public int getCycle_id() {
		return cycle_id;
	}
	public void setCycle_id(int cycle_id) {
		this.cycle_id = cycle_id;
	}
	public String getCycle_name() {
		return cycle_name;
	}
	public void setCycle_name(String cycle_name) {
		this.cycle_name = cycle_name;
	}
	
	public Cycle(int cycle_id, String cycle_name) {
		super();
		this.cycle_id = cycle_id;
		this.cycle_name = cycle_name;
	}
	public Cycle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
