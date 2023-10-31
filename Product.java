package com.javatpoint.server.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	private int product_id;
	private String Product_name;
	private String company;
	
	@Transient
	private MultipartFile file;

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return Product_name;
	}

	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public Product(int product_id, String product_name, String company, MultipartFile file) {
		super();
		this.product_id = product_id;
		Product_name = product_name;
		this.company = company;
		this.file = file;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
