package com.aurionpro.model;

public class Square implements Ishape {

	private double side;

	public Square(double side) {

		this.side = side;

	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

}
