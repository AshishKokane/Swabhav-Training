package com.aurionpro.test;

public class IncrementNumber {

	public static void main(String[] args) {
		int a = 10;
		System.out.println("value of a before method call :" + a);

		incrementByOne(a);

		System.out.println("value of a after method call :" + a);

	}

	public static void incrementByOne(int a) {

		a++;

		// System.out.println("vale of a in method :" + a);

	}

}
