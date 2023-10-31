package com.javatpoint.server.main.model;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="contacts")
public class Contact {
	
	@Id
	private int c_id;
	private String network1;
	private int c_number;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(foreignKey = @ForeignKey(name = "person_id"),name="person_id")
	private Person person;

	
	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getNetwork1() {
		return network1;
	}

	public void setNetwork1(String network1) {
		this.network1 = network1;
	}

	public int getC_number() {
		return c_number;
	}

	public void setC_number(int c_number) {
		this.c_number = c_number;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Contact(int c_id, String network1, int c_number, Person person) {
		super();
		this.c_id = c_id;
		this.network1 = network1;
		this.c_number = c_number;
		this.person = person;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
