package com.javatpoint.server.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employeee")
public class Employeee {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empl_id;
	
	private String empl_email;
	private String empl_name;
	
	@ManyToOne(optional= false)
	@JoinColumn(name="position_id",nullable=false,referencedColumnName = "p_id")
	private Position position;

	public int getEmpl_id() {
		return empl_id;
	}

	public void setEmpl_id(int empl_id) {
		this.empl_id = empl_id;
	}

	public String getEmpl_email() {
		return empl_email;
	}

	public void setEmpl_email(String empl_email) {
		this.empl_email = empl_email;
	}

	public String getEmpl_name() {
		return empl_name;
	}

	public void setEmpl_name(String empl_name) {
		this.empl_name = empl_name;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Employeee(int empl_id, String empl_email, String empl_name, Position position) {
		super();
		this.empl_id = empl_id;
		this.empl_email = empl_email;
		this.empl_name = empl_name;
		this.position = position;
	}

	public Employeee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
