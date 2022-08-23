package com.aurionpro.test;

import com.aurionpro.model.Order;

public class OrderTest {

	public static void main(String[] args) {

		Order order1 = new Order(111, "bOAT earphones", 999);

		try {
			Order order2 = (Order) order1.clone();

			System.out.println(order2.getOrderName());

			Order order3 = (Order) order2.clone();

			System.out.println(order3.hashCode());
			System.out.println(order2.hashCode());

		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}

	}

}
