package com.aurionpro.case2;

public class A {
	int two;

	public A(int two) {

		this.two = two;

		System.out.println("case 2 inside parent A class: " + two);

	}

	public A() {

		this(2);

	}

	public int getTwo() {
		return two;
	}

}
