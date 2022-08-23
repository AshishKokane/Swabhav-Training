package com.aurionpro.model;

public class Rectangle {

	private float width;

	private float height;
	private String color;

	public Rectangle(float width, float height, String color) {

		this.width = validateValue(width);
		this.height = validateValue(height);

		this.color = validateColor(color);
	}

	public String getColor() {
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

	private String validateColor(String color) {
		String value = color.toLowerCase();

		// can be used this way to color.equalsIgnoreCase("red");
		if (value.equals("red") || value.equals("blue") || value.equals("green"))
			return value;

		else
			return "red";

	}

	private float validateValue(float value) {
		if (value <= 0)
			return 1;

		if (value >= 100)
			return 100;

		return value;
	}

}
