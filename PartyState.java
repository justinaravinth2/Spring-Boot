package com.javatpoint.server.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mg_party_state")
public class PartyState {
	
	@Id
	private int mg_party_state_id;
	private String party_state;
	private String gstin;
	private int state_no;
	
	public int getMg_party_state_id() {
		return mg_party_state_id;
	}
	public void setMg_party_state_id(int mg_party_state_id) {
		this.mg_party_state_id = mg_party_state_id;
	}
	
	public String getParty_state() {
		return party_state;
	}
	public void setParty_state(String party_state) {
		this.party_state = party_state;
	}
	public String getGstin() {
		return gstin;
	}
	public void setGstin(String gstin) {
		this.gstin = gstin;
	}
	public int getState_no() {
		return state_no;
	}
	public void setState_no(int state_no) {
		this.state_no = state_no;
	}
	
	public PartyState(int mg_party_state_id, String party_state, String gstin, int state_no) {
		super();
		this.mg_party_state_id = mg_party_state_id;
		this.party_state = party_state;
		this.gstin = gstin;
		this.state_no = state_no;
	}
	public PartyState() {
		super();
	}
	
}