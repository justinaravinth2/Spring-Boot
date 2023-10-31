package com.javatpoint.server.main.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="manager")
@SequenceGenerator(name="ma",sequenceName = "manag",initialValue = 1,allocationSize = 1)
public class Manager {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ma")
	private int m_no;
	private String m_name;
	private String m_city;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="f_no",referencedColumnName = "m_no")
	private List<Cars>cars=new ArrayList<>();
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_city() {
		return m_city;
	}
	public void setM_city(String m_city) {
		this.m_city = m_city;
	}
	public List<Cars> getCars() {
		return cars;
	}
	public void setCars(List<Cars> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "Manager [m_no=" + m_no + ", m_name=" + m_name + ", m_city=" + m_city + ", cars=" + cars + "]";
	}
	public Manager(int m_no, String m_name, String m_city, List<Cars> cars) {
		super();
		this.m_no = m_no;
		this.m_name = m_name;
		this.m_city = m_city;
		this.cars = cars;
	}
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
