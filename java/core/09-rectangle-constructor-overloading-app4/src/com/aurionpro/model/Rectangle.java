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

	public Rectangle(float width, float height) {

		this.width = validateValue(width);
		this.height = validateValue(height);

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
