package com.javatpoint.server.main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="seq_id",sequenceName = "uniworld_seq",initialValue = 1,allocationSize = 1)

@Table(name="uniworld")
public class Uniworld {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_id")
	private int uniticket;
	
	private Date tick_date=new Date();
	private String issue;
	
	public int getUniticket() {
		return uniticket;
	}
	public void setUniticket(int uniticket) {
		this.uniticket = uniticket;
	}
	public Date getTick_date() {
		return tick_date;
	}
	public void setTick_date(Date tick_date) {
		this.tick_date = tick_date;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	@Override
	public String toString() {
		return "Uniworld [uniticket=" + uniticket + ", tick_date=" + tick_date + ", issue=" + issue + "]";
	}
	public Uniworld(int uniticket, Date tick_date, String issue) {
		super();
		this.uniticket = uniticket;
		this.tick_date = tick_date;
		this.issue = issue;
	}
	public Uniworld() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
