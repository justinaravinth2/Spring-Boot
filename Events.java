package com.javatpoint.server.main.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="evets")
public class Events {
	
	@Id
	private int doc_id;
	
	private int e_id;
	private String event_name;
	
	@JsonFormat(pattern="yyyy-MM-dd")
    private Date event_date= new Date();
	
	private String status;

	public int getDoc_id() {
		return doc_id;
	}

	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public Date getEvent_date() {
		return event_date;
	}

	public void setEvent_date(Date event_date) {
		this.event_date = event_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Events [doc_id=" + doc_id + ", e_id=" + e_id + ", event_name=" + event_name + ", event_date="
				+ event_date + ", status=" + status + "]";
	}

	public Events(int doc_id, int e_id, String event_name, Date event_date, String status) {
		super();
		this.doc_id = doc_id;
		this.e_id = e_id;
		this.event_name = event_name;
		this.event_date = event_date;
		this.status = status;
	}

	public Events() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
