package com.javatpoint.server.main.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="position1")
public class Position {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int p_id;
	private String p_name;
	
	@OneToMany(mappedBy = "position",cascade=CascadeType.ALL)
	//@JoinColumn(name="empl_id",nullable=false)
	private List<Employeee> employeee=new ArrayList<>();

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public List<Employeee> getEmployeee() {
		return employeee;
	}

	public void setEmployeee(List<Employeee> employeee) {
		this.employeee = employeee;
	}
	

	public Position(int p_id, String p_name, List<Employeee> employeee) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.employeee = employeee;
	}

	public Position() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
