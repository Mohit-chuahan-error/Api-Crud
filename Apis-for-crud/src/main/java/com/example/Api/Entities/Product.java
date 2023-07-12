package com.example.Api.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	private int pid;
	private String name;
	private String lname;
	private int price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int pid, String name, String lname, int price) {
		super();
		this.pid = pid;
		this.name = name;
		this.lname = lname;
		this.price = price;
	}
	public Product() {
		super();
	}
	
	
	
	
}
