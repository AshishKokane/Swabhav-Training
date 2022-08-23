package com.aurionpro.model;

public class AreaTest {

	public static void main(String[] args) {

		Reactanglee r = new Reactanglee(10, 20);
		System.out.println(r);
		if (isRectangle(r))
			System.out.println("Object is rectangle");
		else
			System.out.println("Object is not retangle");

		System.out.println("======================================");

		Square s = new Square(10);

		if (isRectangle(s))
			System.out.println("Object is rectangle");
		else
			System.out.println("Object is not retangle");

		s.setLength(30);
		System.out.println(s);

	}

	public static boolean isRectangle(Reactanglee rectObj) {
		double before = rectObj.getBreath();
		rectObj.setLength(50);

		double after = rectObj.getBreath();

		return before == after;

	}

}
