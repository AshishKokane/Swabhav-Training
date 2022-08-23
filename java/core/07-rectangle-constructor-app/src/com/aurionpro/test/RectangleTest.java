package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle smallRectangle = new Rectangle(20, 60, "BLUE");

		display(smallRectangle);

		System.out.println("-------------------------");

		// Rectangle bigRectangle = new Rectangle(30, 60, "black");

		// display(bigRectangle);

	}

	private static void display(Rectangle rectangle)

	{

		System.out.println(" width of  Rectangle: " + rectangle.getWidth());
		System.out.println(" heigth of  Rectangle: " + rectangle.getHeight());
		System.out.println(" color of  Rectangle: " + rectangle.getColor());

		System.out.println(" Area of  Rectangle: " + rectangle.calculateArea());

	}

}
