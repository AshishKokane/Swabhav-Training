package com.aurionpro.model;

public class Rectangle {

	private float width;

	private float height;
	private ColorType color;

	static public int count = 0;

	public Rectangle(float width, float height, ColorType color) {

		this.width = validateValue(width);
		this.height = validateValue(height);

		this.color = color;

		count++;

	}

	public Rectangle(float width, float height) {

		this(width, height, ColorType.BLUE);
	}

	public Rectangle() {

		this(20, 40, ColorType.BLUE);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + Float.floatToIntBits(height);
		result = prime * result + Float.floatToIntBits(width);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (color != other.color)
			return false;
		if (Float.floatToIntBits(height) != Float.floatToIntBits(other.height))
			return false;
		if (Float.floatToIntBits(width) != Float.floatToIntBits(other.width))
			return false;
		return true;
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
