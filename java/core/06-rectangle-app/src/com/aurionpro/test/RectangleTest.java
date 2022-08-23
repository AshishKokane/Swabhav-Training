package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle smallRectangle = new Rectangle();

		smallRectangle.setWidth(20);
		smallRectangle.setHeight(40);

		setRectangleDetails(smallRectangle, 10, 20);
		display(smallRectangle);

		System.out.println("*************************");

		Rectangle bigRectangle = new Rectangle();

		setRectangleDetails(bigRectangle, 100, 200);

		display(bigRectangle);

	}

	private static void setRectangleDetails(Rectangle rectangle, int weidth, int height) {

		rectangle.setWidth(weidth);
		rectangle.setHeight(height);

	}

	private static void display(Rectangle rectangle)

	{

		System.out.println(" width of  Rectangle: " + rectangle.getWidth());
		System.out.println(" heigth of  Rectangle: " + rectangle.getHeight());

		System.out.println(" Area of  Rectangle: " + rectangle.calculateArea());

	}

}
