package com.javatpoint.server.main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="id5",sequenceName = "p_seq5",initialValue = 1,allocationSize = 1)

@Table(name="problem1")
public class Problem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "id5")
	private int p_id;
	private Date p_date=new Date();
	private String issue;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public Date getP_date() {
		return p_date;
	}
	public void setP_date(Date p_date) {
		this.p_date = p_date;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	@Override
	public String toString() {
		return "Problem [p_id=" + p_id + ", p_date=" + p_date + ", issue=" + issue + "]";
	}
	public Problem(int p_id, Date p_date, String issue) {
		super();
		this.p_id = p_id;
		this.p_date = p_date;
		this.issue = issue;
	}
	public Problem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
