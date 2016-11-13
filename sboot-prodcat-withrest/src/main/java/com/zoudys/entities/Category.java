package com.zoudys.entities;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Document(collection="Categorie")
public class Category implements Serializable{

	@Id
	private String idCategory;
	
	@Field(value="nom_produit")
	private String name;
	
	@Field
	private String description;
	
	private Collection<Product> products;

	public String getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(String idCategory) {
		this.idCategory = idCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<Product> getProducts() {
		return products;
	}

	public void setProducts(Collection<Product> products) {
		this.products = products;
	}

	public Category() {	}

	public Category(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public Category(String name, String description, Collection<Product> products) {
		super();
		this.name = name;
		this.description = description;
		this.products = products;
	}
	
	
}
