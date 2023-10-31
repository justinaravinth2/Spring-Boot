package com.javatpoint.server.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="bikegen",sequenceName = "bike_seq",initialValue = 1,allocationSize = 1)
@Table(name="bike")
public class Bike {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "bikegen")
	private int bike_id;
	private String bike_name;
	private String year_of_purchase;
	private String owner_name;
	private String address;
	public int getBike_id() {
		return bike_id;
	}
	public void setBike_id(int bike_id) {
		this.bike_id = bike_id;
	}
	public String getBike_name() {
		return bike_name;
	}
	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}
	public String getYear_of_purchase() {
		return year_of_purchase;
	}
	public void setYear_of_purchase(String year_of_purchase) {
		this.year_of_purchase = year_of_purchase;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Bike [bike_id=" + bike_id + ", bike_name=" + bike_name + ", year_of_purchase=" + year_of_purchase
				+ ", owner_name=" + owner_name + ", address=" + address + "]";
	}
	public Bike(int bike_id, String bike_name, String year_of_purchase, String owner_name, String address) {
		super();
		this.bike_id = bike_id;
		this.bike_name = bike_name;
		this.year_of_purchase = year_of_purchase;
		this.owner_name = owner_name;
		this.address = address;
	}
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
