package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private int id;
	private String name;
	List<Order> orders = new ArrayList<Order>();

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void addOrder(Order order) {

		orders.add(order);

	}
	
	public int getOrderCount() {
		
		return orders.size();
	}

	@Override
	public String toString() {
		return "\n Customer [id=" + id + ", name=" + name + ", orders=" + orders + ", getOrders()=" + getOrders()
				+ ", getOrderCount()=" + getOrderCount() + "]";
	}


	
	
	
	
	

}
