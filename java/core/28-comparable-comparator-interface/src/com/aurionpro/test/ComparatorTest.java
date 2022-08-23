package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.aurionpro.model.Order;
import com.aurionpro.model.SortById;

public class ComparatorTest {

	public static void main(String[] args) {

		ArrayList<Order> orders = new ArrayList<Order>();
		orders.add(new Order(101, "Bag", 4500));
		orders.add(new Order(104, "Toys", 5500));
		orders.add(new Order(102, "phone", 7500));
		orders.add(new Order(103, "Book", 4500));

		for (Order order : orders) {
			System.out.println(order);
		}

		System.out.println("--------------------------------------------------------");

		Comparator<Order> orderName = new Comparator<Order>() {

			@Override
			public int compare(Order o1, Order o2) {

				return o1.getOrderName().compareTo(o2.getOrderName());

			}
		};

		Collections.sort(orders, new SortById());

		for (Order order : orders) {
			System.out.println(order);
		}

		System.out.println("--------------------------------------------------------");
		Collections.sort(orders, orderName);

		for (Order order : orders) {
			System.out.println(order);
		}

	}

}
