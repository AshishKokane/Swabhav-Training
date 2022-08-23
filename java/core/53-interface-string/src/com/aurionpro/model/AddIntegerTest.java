package com.aurionpro.model;

import com.aurionpro.test.IAddable;

public class AddIntegerTest {

	public static void main(String[] args) {

		IAddable add = new IAddable() {

			@Override
			public int addInteger(int i, int j) {

				return i + j;
			}
		};
		int total = add.addInteger(10, 20);

		System.out.println("Addition of 10 and 20 in anonymous :-" + total);

		IAddable add1 = (i, j) -> {

			return i + j;
		};

		int total1 = add1.addInteger(30, 45);
		System.out.println("inside lambda addition: - " + total1);

		IAddable add2 = AddIntegerTest::execute;
		int total3 = add2.addInteger(5, 5);
		System.out.println("add in static reference:-" + total3);

	}

	public static int execute(int i, int j) {

		return i + j;
	}

}
