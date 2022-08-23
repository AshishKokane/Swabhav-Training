package com.aurionpro.model;

import java.util.ArrayList;

import com.aurionpro.test.LineItem;

public class LineItemTest {

	public static void main(String[] args) {

		ArrayList<LineItem> items = new ArrayList<>();
		items.add(new LineItem(101, "ParleG", 5, 5));
		items.add(new LineItem(102, "goodDay", 10, 5));
		items.add(new LineItem(103, "FAB", 5, 20));
		items.add(new LineItem(104, "TigerCrunch", 5, 5));

		for (LineItem item : items) {
			System.out.println(item);
		}

		System.out.println("Total Bill: =" + calculateTotalBill(items));

	}

	private static double calculateTotalBill(ArrayList<LineItem> items) {

		double sum = 0;
		for (int i = 0; i < items.size(); i++) {
			sum = sum + items.get(i).getTotalPrice();
		}

		return (sum);

	}

}
