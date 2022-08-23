package com.aurionpro.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.aurionpro.test.LineItem;

public class LineItemTestSet {

	public static void main(String[] args) {

		Set<LineItem> items = new HashSet<LineItem>();

		items.add(new LineItem(101, "ParleG", 5, 5));
		items.add(new LineItem(102, "goodDay", 10, 5));
		items.add(new LineItem(103, "FAB", 5, 20));
		items.add(new LineItem(104, "TigerCrunch", 5, 5));
		items.add(new LineItem(104, "TigerCrunch", 5, 5));
		items.add(new LineItem(104, "TigerCrunch", 5, 5));
		items.add(new LineItem(104, "TigerCrunch", 5, 5));

		for (LineItem item : items) {
			System.out.println(item);
		}

		System.out.println("Total Bill: =" + calculateTotalBill(items));
	}

	private static double calculateTotalBill(Set<LineItem> items) {

		ArrayList<LineItem> itemsvalue = new ArrayList<LineItem>(items);

		double sum = 0;
		for (int i = 0; i < itemsvalue.size(); i++) {
			sum = sum + itemsvalue.get(i).getTotalPrice();
		}

		return (sum);

	}

}
