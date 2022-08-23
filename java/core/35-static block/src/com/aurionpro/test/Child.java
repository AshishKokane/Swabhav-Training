package com.aurionpro.test;

public class Child extends Parent {

	public static final int c = 2;

	public Child() {
		System.out.println(" in child constructor");
	}

	static {
		System.out.println(" in child class static :" + c + "  accessing parent constant value = " + p);
	}

	public void show() {

		System.out.println(" in child class display method: " + c + "  parent constant value = " + p);

	}

}
