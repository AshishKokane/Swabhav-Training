package com.aurionpro.model;

public class Square extends Reactanglee {

	private double side;

	public Square(double side) {

		super(side, side);

	}

	@Override
	public void setLength(double length) {
		super.setLength(length);
		super.setBreath(length);
	}

	public void setBreath(double breath) {
		super.setLength(breath);
		super.setBreath(breath);
	}

}
