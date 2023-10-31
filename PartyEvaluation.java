package com.javatpoint.server.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mg_party_evaluation")
public class PartyEvaluation {
	
	@Id
	private int mg_party_evaluation_id;
	private int sla_points;
	private String justification;
	
	public int getMg_party_evaluation_id() {
		return mg_party_evaluation_id;
	}
	public void setMg_party_evaluation_id(int mg_party_evaluation_id) {
		this.mg_party_evaluation_id = mg_party_evaluation_id;
	}
	
	public int getSla_points() {
		return sla_points;
	}
	public void setSla_points(int sla_points) {
		this.sla_points = sla_points;
	}
	public String getJustification() {
		return justification;
	}
	public void setJustification(String justification) {
		this.justification = justification;
	}
	
	public PartyEvaluation(int mg_party_evaluation_id, int sla_points, String justification) {
		super();
		this.mg_party_evaluation_id = mg_party_evaluation_id;
		this.sla_points = sla_points;
		this.justification = justification;
	}
	public PartyEvaluation() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
