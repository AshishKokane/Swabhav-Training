package com.aurionpro.model;

public class Circle {

	private double radius;

	private ColorType color;

	private BorderType border;

	public Circle(double radius, ColorType color, BorderType border) {

		this.radius = validateValue(radius);
		this.color = color;
		this.border = border;

	}

	public Circle(double radius) {

		this(radius, ColorType.RED, BorderType.DASHED);

	}

	public Circle(double radius, ColorType color) {

		this(radius, color, BorderType.DOTTED);

	}

	public Circle(double radius, BorderType border) {

		this(radius, ColorType.ORANGE, border);

	}

	public Circle() {
		this(35.5, ColorType.PINK, BorderType.SOLID);

	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", border=" + border + "]";
	}

	public BorderType getBorder() {
		return border;
	}

	public ColorType getColor() {
		return color;
	}

	public double getRadius() {
		return radius;
	}

	public double calculateArea() {

		return (3.14 * radius * radius);
	}

	private double validateValue(double value) {
		if (value <= 0)
			return 1;

		if (value >= 100)
			return 100;

		return value;
	}

}
