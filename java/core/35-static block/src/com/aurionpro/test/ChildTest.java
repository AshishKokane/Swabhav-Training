package com.aurionpro.test;

public class ChildTest {

	static {

		System.out.println("Static above main...");
	}

	public static void main(String[] args) {
		System.out.println("in main method");
		Child ch = new Child();
		Child ch1 = new Child();

	}

}
