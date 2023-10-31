package com.javatpoint.server.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="")
public class Parcel {
	
	@Id
	private int parcel_id;
	private String item_name;
	private int weight;
	private String shipp_from;
	private String design_to;
	public int getParcel_id() {
		return parcel_id;
	}
	public void setParcel_id(int parcel_id) {
		this.parcel_id = parcel_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getShipp_from() {
		return shipp_from;
	}
	public void setShipp_from(String shipp_from) {
		this.shipp_from = shipp_from;
	}
	public String getDesign_to() {
		return design_to;
	}
	public void setDesign_to(String design_to) {
		this.design_to = design_to;
	}
	@Override
	public String toString() {
		return "Parcel [parcel_id=" + parcel_id + ", item_name=" + item_name + ", weight=" + weight + ", shipp_from="
				+ shipp_from + ", design_to=" + design_to + "]";
	}
	public Parcel(int parcel_id, String item_name, int weight, String shipp_from, String design_to) {
		super();
		this.parcel_id = parcel_id;
		this.item_name = item_name;
		this.weight = weight;
		this.shipp_from = shipp_from;
		this.design_to = design_to;
	}
	public Parcel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
