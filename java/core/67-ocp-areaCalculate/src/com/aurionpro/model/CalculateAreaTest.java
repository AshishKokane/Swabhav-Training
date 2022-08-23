package com.aurionpro.model;

public class CalculateAreaTest {

	public static void main(String[] args) {
		// Rectangle

		AreaCalculate ar = new AreaCalculate(new Circle(40));

		ar.showArea();

		AreaCalculate ar1 = new AreaCalculate(new Reactanglee(40, 20));

		ar1.showArea();

	}

}
