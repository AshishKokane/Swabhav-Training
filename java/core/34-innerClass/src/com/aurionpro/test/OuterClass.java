package com.aurionpro.test;

public class OuterClass {

	public static int a;

	public void show() {
		System.out.println("outer class display");

	}

	public static class InnerClass {

		public void show() {

			System.out.println("inner class display");

		}

	}

}
