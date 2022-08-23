package com.aurionpro.model;

public class OrderRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("creating order");

	}

	@Override
	public void update() {
		System.out.println("updating order");

	}

	@Override
	public void read() {
		System.out.println("Reading order");

	}

	@Override
	public void delete() {
		System.out.println("deleting order");

	}

}
