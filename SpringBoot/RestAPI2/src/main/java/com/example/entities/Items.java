package com.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Items-Rest")
public class Items {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "Items-ID")
	private int id;
	
	@Column(name = "Items-Name")
	private String name;
	
	@Column(name = "Items-Description")
	private String description;
	
	@Column(name = "Items-Price")
	private int price;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}
	
	
	
	

}
