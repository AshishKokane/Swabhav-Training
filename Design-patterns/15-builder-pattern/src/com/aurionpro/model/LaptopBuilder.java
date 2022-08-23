package com.aurionpro.model;

public class LaptopBuilder {

	Laptop laptop;

	public LaptopBuilder() {
		super();
		laptop = new Laptop();
	}
	
	public LaptopBuilder addHdd(String hdd) {
		laptop.setHdd(hdd);
		return this;
	}
	
	
	public LaptopBuilder addRAM(String ram) {
		laptop.setRam(ram);
		return this;
	}
	
	
	public LaptopBuilder addTouchScreen(String touchScreen) {
		laptop.setTouchScreen(touchScreen);
		return this;
	}
	
	
	
	public LaptopBuilder addKeyboard(String Keyboard) {
		laptop.setKeyboard(Keyboard);
		return this;
	}
	
	
	public Laptop getlaptop() {
		return laptop;
	}
	
	
}
