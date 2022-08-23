package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListSet {

	public static void main(String[] args) {

		ArrayList<String> Departments = new ArrayList<>();

		// add elements to ArrayList
		Departments.add("Computer Engineering");
		Departments.add("Mechanical Engineering");
		Departments.add("Extc Engineering");
		Departments.add("Mechanical Engineering");
		Departments.add(0, "EXTC");

		System.out.println("ArrayList: " + Departments);
		Collections.sort(Departments);
		System.out.println("ArrayList: " + Departments);

		// replace element at index 1
		String element = Departments.set(1, "IT");
		System.out.println("Updated ArrayList: " + Departments);
		System.out.println("Replaced Element: " + element);

		System.out.println(
				"---------------------------------------------------------------------------------------------------------");

		Set<String> Department = new HashSet<String>();

		Department.addAll(Departments);

		// add elements to ArrayList
//		Department.add("Computer Engineering");
		Department.add("Mechanical Engineering");
//		Department.add("Extc Engineering");
		Department.add("Mechanical Engineering");
		Department.remove("Extc Engineering");
		System.out.println("ArrayList" + Departments);
		System.out.println("SET: " + Department);

		System.out.println(
				"---------------------------------------------------------------------------------------------------------");

		ArrayList<Order> orders = new ArrayList<Order>();
		orders.add(new Order(101, "Bag", 4500));
		orders.add(new Order(102, "phone", 7500));
		orders.add(new Order(103, "Book", 4500));
		orders.add(new Order(101, "Bag", 4500));
		orders.add(new Order(0, null, 0));

		System.out.println(
				"---------------------------------------------------------------------------------------------------------");

		System.out.println(orders.get(0).hashCode());
		System.out.println(orders.get(3).hashCode());

		for (Order order : orders) {
			System.out.println(order);
		}

		orders.remove(4);
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");

		// System.out.println(orders);
		orders.add(0, new Order(103, "Book", 4500));
		// System.out.println("ArrayList:-" + orders);

		System.out.println("ADDING at 0 index");

		for (Order order : orders) {
			System.out.println(order);
		}

		System.out.println(
				"---------------------------------------------------------------------------------------------------------");

		Set<Order> orderSet = new HashSet<Order>();

		// orderSet.addAll(orders);
		System.out.println("Order Set:-" + orderSet);
		orderSet.add(new Order(105, "watch", 550));
		orderSet.add(new Order(105, "watch", 550));
		orderSet.add(new Order(0, null, 0));

//		System.out.println(((ArrayList<Order>) orderSet).get(0).hashCode());
//		System.out.println(((ArrayList<Order>) orderSet).get(1).hashCode());

		for (Order order : orderSet) {
			System.out.println(order);
		}

		TreeSet<String> treeset = new TreeSet<>();
		treeset.add("G");
		treeset.add("X");
		treeset.add("A");
		treeset.add("A");
		treeset.add("A");

		System.out.println(treeset);

//		TreeSet<Order> tree = new TreeSet<Order>();
//		Order o1 = new Order(101, "Bag", 450);
//		Order o2 = new Order(102, "book", 550);
//		Order o3 = new Order(103, "watch", 500);
//		tree.add(o1);
//		tree.add(o3);
//		tree.add(o2);
//
//		for (Order order : tree) {
//			System.out.println(order);
//		}

	}

}
