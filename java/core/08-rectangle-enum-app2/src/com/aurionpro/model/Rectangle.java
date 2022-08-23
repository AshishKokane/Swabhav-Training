package com.aurionpro.model;

public class Rectangle {

	final private float width;

	final private float height;
	final private ColorType color;

	public Rectangle(float width, float height, ColorType color) {

		this.width = validateValue(width);
		this.height = validateValue(height);

		this.color = color;
	}

	// no setter for final varaibles
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
