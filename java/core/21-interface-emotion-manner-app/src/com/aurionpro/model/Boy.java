package com.aurionpro.model;

public class Boy implements IMannerable {

	@Override
	public void greet() {
		System.out.println("boy greet");

	}

	@Override
	public void depart() {
		System.out.println("boy departs");

	}

}
