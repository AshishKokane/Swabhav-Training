package com.aurionpro.model;

public enum Season {
	WINTER(5), SPRING(10), SUMMER(15), FALL(20);

	int value;

	private Season(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}


}
