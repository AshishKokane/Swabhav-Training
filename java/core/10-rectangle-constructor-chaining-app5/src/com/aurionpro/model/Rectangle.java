package com.aurionpro.model;

public class Rectangle {

	private float width;

	private float height;
	private ColorType color;

	public Rectangle(float width, float height, ColorType color) {

		this.width = validateValue(width);
		this.height = validateValue(height);

		this.color = color;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + "]";
	}

	public Rectangle(float width, float height) {

		this(width, height, ColorType.RED);

		// this will call upper line no 10 constructor
		// this is called constructor chaining
		// calling constructor inside constructor

	}

	public Rectangle(float height) {
		this(10, height, ColorType.RED);

	}

	public ColorType getColor() {
		return color;
	}

	public float getWidth() {
		return width;
	}

	public float getHeight() {
		return height;
	}

	public float calculateArea() {

		return (width * height);
	}

	private float validateValue(float value) {
		if (value <= 0)
			return 1;

		if (value >= 100)
			return 100;

		return value;
	}

}
