package com.aurionpro.model;

public class LaptopTest {

	public static void main(String[] args) {
	Laptop laptop = new LaptopBuilder().addHdd("255HDD").addKeyboard("gamingKeyboard")
			.addRAM("32GB").addTouchScreen("addTouch").getlaptop();
	
	System.out.println(laptop);
	

	
	
	

	}

}
