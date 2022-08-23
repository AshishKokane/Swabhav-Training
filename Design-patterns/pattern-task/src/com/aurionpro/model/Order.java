package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private int id;
	private String date;

	List<LineItem> items = new ArrayList<>();

	public Order(int id, String date) {
		super();
		this.id = id;
		this.date = date;

	}

	public int getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public void addLineItem(LineItem item) {
		
		items.add(item);
	}
	
	public int itemsCount() {
		
		return items.size();
	}
	
	public double calculateOrderprice() {
		double orderPrice=0;
		
		for(LineItem item: items) {
			orderPrice = orderPrice+item.calculateLineItemCost();
		}
		
		return orderPrice;
	}

	@Override
	public String toString() {
		return "\n Order [id=" + id + ", date=" + date + ", items=" + items + ", itemsCount()=" + itemsCount()
				+ ", calculateOrderprice()=" + calculateOrderprice() + "]";
	}

//	@Override
//	public String toString() {
//		return "\n Order [id=" + id + ",date=" + date + ", \n items=" + items + "]";
//	}


	
	
}
