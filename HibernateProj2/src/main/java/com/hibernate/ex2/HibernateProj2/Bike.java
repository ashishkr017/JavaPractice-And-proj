package com.hibernate.ex2.HibernateProj2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike 
{
	@Id
	int bikeId;
	String brand;
	String color;
	public Bike() {
		// TODO Auto-generated constructor stub
	}
	public Bike(int bikeId, String brand, String color) {
	
		this.bikeId = bikeId;
		this.brand = brand;
		this.color = color;
	}
	public int getBikeId() {
		return bikeId;
	}
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
  
}
