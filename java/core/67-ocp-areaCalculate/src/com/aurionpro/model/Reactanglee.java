package com.aurionpro.model;

public class Reactanglee implements Shape {

	private double length;
	private double breath;

	public Reactanglee(double length, double breath) {
		super();
		this.length = length;
		this.breath = breath;
	}

	public double getLength() {
		return length;
	}

	public double getBreath() {
		return breath;
	}

	@Override
	public double calculateArea() {

		return length * breath;
	}

}
