package com.aurionpro.test;

import com.aurionpro.model.ColorType;
import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle smallRectangle = new Rectangle(20, 60, ColorType.BLUE);

		display(smallRectangle);

		System.out.println("-------------------------");

		// no setter for final variable
		// error on smallRectangle.setHeight(45);

	}

	private static void display(Rectangle rectangle)

	{

		System.out.println(" width of  Rectangle: " + rectangle.getWidth());
		System.out.println(" heigth of  Rectangle: " + rectangle.getHeight());
		System.out.println(" color of  Rectangle: " + rectangle.getColor());

		System.out.println(" Area of  Rectangle: " + rectangle.calculateArea());

	}

}
