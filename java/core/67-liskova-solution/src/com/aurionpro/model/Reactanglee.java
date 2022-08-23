package com.aurionpro.model;

public class Reactanglee implements Ishape {

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

	public void setLength(double length) {
		this.length = length;
	}

	public void setBreath(double breath) {
		this.breath = breath;
	}

	@Override
	public String toString() {
		return "Reactanglee [length=" + length + ", breath=" + breath + "]";
	}

	@Override
	public double calculateArea() {

		return length * breath;

	}

}
