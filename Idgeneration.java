package com.javatpoint.server.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="seq_id",sequenceName = "seq_gen",initialValue = 1,allocationSize = 1)

@Table(name="id_generation")
public class Idgeneration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_id")
	private int sequence_id;
	private String sname;
	private String saddress;
	
	public int getSequence_id() {
		return sequence_id;
	}
	public void setSequence_id(int i) {
		this.sequence_id = i;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	@Override
	public String toString() {
		return "Idgeneration [sequence_id=" + sequence_id + ", sname=" + sname + ", saddress=" + saddress + "]";
	}
	public Idgeneration(int sequence_id, String sname, String saddress) {
		super();
		this.sequence_id = sequence_id;
		this.sname = sname;
		this.saddress = saddress;
	}
	public Idgeneration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
