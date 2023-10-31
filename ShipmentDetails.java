package com.javatpoint.server.main.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="so_shipmentdetails")
public class ShipmentDetails {
	
	@Id
	@Column
	private int so_details_id;
	private int pkgs;
	private double chwt;
	private double grwt;
	private String pkgs_type;
	private double total_vol_ch_wt;
	
	public int getSo_details_id() {
		return so_details_id;
	}
	public void setSo_details_id(int so_details_id) {
		this.so_details_id = so_details_id;
	}
	public int getPkgs() {
		return pkgs;
	}
	public void setPkgs(int pkgs) {
		this.pkgs = pkgs;
	}
	public double getChwt() {
		return chwt;
	}
	public void setChwt(double chwt) {
		this.chwt = chwt;
	}
	public double getGrwt() {
		return grwt;
	}
	public void setGrwt(double grwt) {
		this.grwt = grwt;
	}
	
	public String getPkgs_type() {
		return pkgs_type;
	}
	public void setPkgs_type(String pkgs_type) {
		this.pkgs_type = pkgs_type;
	}
	
	public double getTotal_vol_ch_wt() {
		return total_vol_ch_wt;
	}
	public void setTotal_vol_ch_wt(double total_vol_ch_wt) {
		this.total_vol_ch_wt = total_vol_ch_wt;
	}
	
	public ShipmentDetails(int so_details_id, int pkgs, double chwt, double grwt, String pkgs_type,
			double total_vol_ch_wt) {
		super();
		this.so_details_id = so_details_id;
		this.pkgs = pkgs;
		this.chwt = chwt;
		this.grwt = grwt;
		this.pkgs_type = pkgs_type;
		this.total_vol_ch_wt = total_vol_ch_wt;
	}
	public ShipmentDetails() {
		super();
		
	}		

}
