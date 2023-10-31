package com.javatpoint.server.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mg_party_currency")
public class PartyCurrency {
	
	@Id
	private int mg_party_currency_id;
	private String currency;
	
	public int getMg_party_currency_id() {
		return mg_party_currency_id;
	}
	public void setMg_party_currency_id(int mg_party_currency_id) {
		this.mg_party_currency_id = mg_party_currency_id;
	}
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public PartyCurrency(int mg_party_currency_id, String currency) {
		super();
		this.mg_party_currency_id = mg_party_currency_id;
		this.currency = currency;
	}
	public PartyCurrency() {
		super();
		
	}
	

}