package com.aurionpro.test;

import java.text.DecimalFormat;

import com.aurionpro.model.BorderType;
import com.aurionpro.model.Circle;
import com.aurionpro.model.ColorType;

public class CircleTest {

	public static void main(String[] args) {

		Circle[] circles = { new Circle(20, ColorType.BLUE, BorderType.DASHED), new Circle(35.5, BorderType.DOTTED),
				new Circle(), new Circle(45, ColorType.VIOLET), new Circle(56) };

		for (Circle c : circles) {
			display(c);
			System.out.println("-------------------------");
		}

	}

	private static void display(Circle circle)

	{
		DecimalFormat ft = new DecimalFormat(" #### ");
		ft = new DecimalFormat(" #.## ");

		System.out.println(" Radius of Circle: " + circle.getRadius());
		System.out.println(" Color of  Circle: " + circle.getColor());
		System.out.println(" Border of Circle: " + circle.getBorder());
		System.out.println(" Area of  Circle: " + ft.format(circle.calculateArea()));
		// System.out.println(circle);

	}

}
