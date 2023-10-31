package com.javatpoint.server.main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="so_house")
public class House {
	
	@Id
	private int shipment_no;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int house_no;
	
	private Date house_date=new Date();

	public int getShipment_no() {
		return shipment_no;
	}

	public void setShipment_no(int shipment_no) {
		this.shipment_no = shipment_no;
	}

	public int getHouse_no() {
		return house_no;
	}

	public void setHouse_no(int house_no) {
		this.house_no = house_no;
	}

	public Date getHouse_date() {
		return house_date;
	}

	public void setHouse_date(Date house_date) {
		this.house_date = house_date;
	}

	public House(int shipment_no, int house_no, Date house_date) {
		super();
		this.shipment_no = shipment_no;
		this.house_no = house_no;
		this.house_date = house_date;
	}
	
	

}
