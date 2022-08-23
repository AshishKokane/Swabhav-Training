package com.aurionpro.test;

import com.aurionpro.model.ColorType;
import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle smallRectangle = new Rectangle(20, 60, ColorType.BLUE);

		display(smallRectangle);

		System.out.println("-------------------------");

		Rectangle bigRectangle = new Rectangle(35, 85);
		display(bigRectangle);

	}

	private static void display(Rectangle rectangle)

	{

		System.out.println(" width of  Rectangle: " + rectangle.getWidth());
		System.out.println(" heigth of  Rectangle: " + rectangle.getHeight());
		System.out.println(" color of  Rectangle: " + rectangle.getColor());

		System.out.println(" Area of  Rectangle: " + rectangle.calculateArea());

	}

}
