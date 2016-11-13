package com.zoudys.entities;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Produit")
public class Product implements Serializable {

	@Id
	private String idProduct;

	@Field
	private String designation;

	@Field(value="Date_expiration")
	private Date expiration;

	@Field(value="prix")
	private double price;

	public String getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getExpiration() {
		return expiration;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product() {
	}

	public Product(String designation, Date expiration, double price) {
		super();
		this.designation = designation;
		this.expiration = expiration;
		this.price = price;
	}

}
