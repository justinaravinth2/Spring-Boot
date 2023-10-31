package com.javatpoint.server.main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@SequenceGenerator(name = "ti_id",sequenceName="seq1_gen", initialValue = 1, allocationSize = 1)
@Table(name="tick")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ti_id")
	private int id;
	
	@JsonFormat(pattern="dd-MM-yyyy")
    private Date ticket_date= new Date();
	
	private String issue;
	private String description;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getTicket_date() {
		return ticket_date;
	}
	public void setTicket_date(Date ticket_date) {
		this.ticket_date = ticket_date;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", ticket_date=" + ticket_date + ", issue=" + issue + ", description="
				+ description + "]";
	}
	public Ticket(int id, Date ticket_date, String issue, String description) {
		super();
		this.id = id;
		this.ticket_date = ticket_date;
		this.issue = issue;
		this.description = description;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
