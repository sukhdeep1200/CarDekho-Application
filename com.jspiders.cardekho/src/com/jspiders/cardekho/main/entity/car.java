package com.jspiders.cardekho.main.entity;

public class car {
	int id;
	String name;
	String brand;
	double price;
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "car [id=" + id + ", name=" + name + ", brand=" 
	+ brand + ", price=" + price + "]";
	}
	
	
	
}