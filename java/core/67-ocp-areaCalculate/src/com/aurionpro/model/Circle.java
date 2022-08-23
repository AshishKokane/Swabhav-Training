package com.aurionpro.model;

public class Circle implements Shape {

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {

		return radius * radius * 3.14;
	}

}
