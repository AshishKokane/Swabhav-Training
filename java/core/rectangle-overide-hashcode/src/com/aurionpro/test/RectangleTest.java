package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();

		System.out.println(r1.equals(r2));
		System.out.println(r1 == r2);
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());

	}

}
