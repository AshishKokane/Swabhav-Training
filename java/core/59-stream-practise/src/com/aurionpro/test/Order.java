package com.aurionpro.test;

public class Order {

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderName == null) ? 0 : orderName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(orderPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + orederId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (orderName == null) {
			if (other.orderName != null)
				return false;
		} else if (!orderName.equals(other.orderName))
			return false;
		if (Double.doubleToLongBits(orderPrice) != Double.doubleToLongBits(other.orderPrice))
			return false;
		if (orederId != other.orederId)
			return false;
		return true;
	}

}
