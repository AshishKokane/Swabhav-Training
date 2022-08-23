package com.aurionpro.model;

public class AreaCalculate {
	Shape shape;

	public AreaCalculate(Shape shape) {
		super();
		this.shape = shape;
	}

	public void showArea() {
		double area = shape.calculateArea();
		System.out.println("Area:: " + area);

	}

}
