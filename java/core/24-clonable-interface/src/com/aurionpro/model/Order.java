package com.aurionpro.model;

public class Order implements Cloneable {

	private int orederId;
	private String orderName;
	private double orderPrice;

	public Order(int orederId, String orderName, double orderPrice) {
		super();
		this.orederId = orederId;
		this.orderName = orderName;
		this.orderPrice = orderPrice;
	}

	public Order() {
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getOrederId() {
		return orederId;
	}

	public String getOrderName() {
		return orderName;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	@Override
	public String toString() {
		return "Order [orederId=" + orederId + ", orderName=" + orderName + ", orderPrice=" + orderPrice + "]";
	}

}
