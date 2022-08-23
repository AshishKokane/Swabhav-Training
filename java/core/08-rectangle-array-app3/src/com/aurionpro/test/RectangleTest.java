package com.aurionpro.test;

import com.aurionpro.model.ColorType;
import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle[] rectangles = { new Rectangle(20, 60, ColorType.BLUE), new Rectangle(35, 50, ColorType.BLUE),
				new Rectangle(45, 80, ColorType.RED), new Rectangle(46, 97, ColorType.RED),
				new Rectangle(35, 75, ColorType.GREEN), };

		for (Rectangle rect : rectangles) {
			display(rect);
			System.out.println("-------------------------");
		}

	}

	private static void display(Rectangle rectangles)

	{

		System.out.println(" width of  Rectangle: " + rectangles.getWidth());
		System.out.println(" heigth of  Rectangle: " + rectangles.getHeight());
		System.out.println(" color of  Rectangle: " + rectangles.getColor());

		System.out.println(" Area of  Rectangle: " + rectangles.calculateArea());

	}

}
