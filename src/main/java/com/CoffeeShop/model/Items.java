package com.CoffeeShop.model;

import java.io.Serializable;

public class Items implements Serializable {
	
	private String itemname;
	private String description;
	private Integer quantity;
	private Float price;
	public Items(String Itemname, String description, int quantity, float price) {
		super();
		this.itemname = Itemname;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		
			
		
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String Itemname) {
		this.itemname = Itemname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	
}
