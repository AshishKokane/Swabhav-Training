package com.aurionpro.model;

import java.util.Comparator;

public class SortById implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {

		if (o1.getOrederId() > o2.getOrederId())
			return 1;
		else
			return -1;

	}

}
