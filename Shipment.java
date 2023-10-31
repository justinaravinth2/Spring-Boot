package com.javatpoint.server.main.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="so_shiments")
public class Shipment {
	
	@Id
	@Column
	private int so_id;
	private int doc_id;
	@JsonFormat(pattern="yyyy-MM-dd")
    private Date doc_date;
	private String shipper;
	private String consignee;
	
	private int total_packages;
	private float total_ch_wt;
	private float total_gr_wt;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="so_id",referencedColumnName = "so_id")
	private Set<ShipmentDetails>shipdetails=new HashSet<>();
	

	public int getSo_id() {
		return so_id;
	}

	public void setSo_id(int so_id) {
		this.so_id = so_id;
	}

	public int getDoc_id() {
		return doc_id;
	}

	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}

	public Date getDoc_date() {
		return doc_date;
	}

	public void setDoc_date(Date doc_date) {
		this.doc_date = doc_date;
	}

	public String getShipper() {
		return shipper;
	}

	public void setShipper(String shipper) {
		this.shipper = shipper;
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	
	public int getTotal_packages() {
		return total_packages;
	}

	public void setTotal_packages(int total_packages) {
		this.total_packages = total_packages;
	}

	public float getTotal_ch_wt() {
		return total_ch_wt;
	}

	public void setTotal_ch_wt(float total_ch_wt) {
		this.total_ch_wt = total_ch_wt;
	}

	public float getTotal_gr_wt() {
		return total_gr_wt;
	}

	public void setTotal_gr_wt(float total_gr_wt) {
		this.total_gr_wt = total_gr_wt;
	}

	public Set<ShipmentDetails> getShipdetails() {
		return shipdetails;
	}

	public void setShipdetails(Set<ShipmentDetails> shipdetails) {
		this.shipdetails = shipdetails;
	}

	

	public Shipment(int so_id, int doc_id, Date doc_date, String shipper, String consignee, int total_packages,
			float total_ch_wt, float total_gr_wt, Set<ShipmentDetails> shipdetails) {
		super();
		this.so_id = so_id;
		this.doc_id = doc_id;
		this.doc_date = doc_date;
		this.shipper = shipper;
		this.consignee = consignee;
		this.total_packages = total_packages;
		this.total_ch_wt = total_ch_wt;
		this.total_gr_wt = total_gr_wt;
		this.shipdetails = shipdetails;
	}

	public Shipment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
		
}
