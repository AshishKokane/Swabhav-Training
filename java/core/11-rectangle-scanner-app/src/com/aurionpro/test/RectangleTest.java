package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.ColorType;
import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {

		System.out.println("Enter Total No of Rectangle Objects");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Rectangle[] rectangles = new Rectangle[n];

		for (int i = 0; i < n; i++) {

			System.out.println("Enter Height: ");

			float ht = sc.nextFloat();

			System.out.println("Enter Width: ");
			float wdt = sc.nextFloat();

			System.out.println("Enter ColorType: ");
			// String color = sc.next();
			ColorType colour;
			try {
				colour = ColorType.valueOf(sc.next().toUpperCase());
				// ColorType colour = ColorType.valueOf(color.toUpperCase());
			} catch (IllegalArgumentException e) {
				colour = ColorType.BLUE;
			}
			rectangles[i] = new Rectangle(wdt, ht, colour);

			System.out.println("-----------------------");
		}

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
