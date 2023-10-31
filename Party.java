package com.javatpoint.server.main.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mg_party")
public class Party {
	
	@Id
	private int mg_party_id;
	private String party_name;
	private int party_code;
	private String gstin;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="mg_party_id",referencedColumnName = "mg_party_id")
	private Set<PartyState>partystate=new HashSet<>();
	
	@OneToMany(cascade =CascadeType.ALL )
	@JoinColumn(name="mg_party_id",referencedColumnName = "mg_party_id")
	private Set<PartyCurrency>partycurrency=new HashSet<>();
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="mg_party_id",referencedColumnName = "mg_party_evaluation_id")
	private PartyEvaluation partyevaluation;
	

	public int getMg_party_id() {
		return mg_party_id;
	}
	
	public void setMg_party_id(int mg_party_id) {
		this.mg_party_id = mg_party_id;
	}

	public String getParty_name() {
		return party_name;
	}

	public void setParty_name(String party_name) {
		this.party_name = party_name;
	}

	public int getParty_code() {
		return party_code;
	}

	public void setParty_code(int party_code) {
		this.party_code = party_code;
	}

	public String getGstin() {
		return gstin;
	}
	
	public void setGstin(String gstin) {
		this.gstin = gstin;
	}
	
	public Set<PartyState> getPartystate() {
		return partystate;
	}

	public void setPartystate(Set<PartyState> partystate) {
		this.partystate = partystate;
	}

	public Set<PartyCurrency> getPartycurrency() {
		return partycurrency;
	}

	public void setPartycurrency(Set<PartyCurrency> partycurrency) {
		this.partycurrency = partycurrency;
	}
	
	public PartyEvaluation getPartyevaluation() {
		return partyevaluation;
	}

	public void setPartyevaluation(PartyEvaluation partyevaluation) {
		this.partyevaluation = partyevaluation;
	}

	public Party(int mg_party_id, String party_name, int party_code, String gstin, Set<PartyState> partystate,
			Set<PartyCurrency> partycurrency, PartyEvaluation partyevaluation) {
		super();
		this.mg_party_id = mg_party_id;
		this.party_name = party_name;
		this.party_code = party_code;
		this.gstin = gstin;
		this.partystate = partystate;
		this.partycurrency = partycurrency;
		this.partyevaluation = partyevaluation;
	}

	public Party() {
		super();
		
	}
	
}