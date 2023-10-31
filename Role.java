package com.javatpoint.server.main.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_role")
public class Role  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int r_id;

    private String name;

    private String dscription;

    @ManyToMany(mappedBy = "roles", cascade = CascadeType.ALL)
    private Set<User> users=new HashSet<>();

	public int getR_id() {
		return r_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDscription() {
		return dscription;
	}

	public void setDscription(String dscription) {
		this.dscription = dscription;
	}

	public Role(int r_id, String name, String dscription) {
		super();
		this.r_id = r_id;
		this.name = name;
		this.dscription = dscription;
		
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
 
}