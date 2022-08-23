package com.aurionpro.test;

public class Parent {

	public static final int p = 1;

	public Parent() {
		System.out.println("in parent constructor");
	}

	static {
		System.out.println(" in Parent class static :  " + p);
	}

	public void show() {

		System.out.println(" in Parent class display method: " + p);

	}

}
