package com.aurionpro.model;

public class Rectangle {

	private float width;
	private float height;

	public void setWidth(float wt) {
		width = wt;
	}

	public void setHeight(float ht) {
		height = ht;
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

}
