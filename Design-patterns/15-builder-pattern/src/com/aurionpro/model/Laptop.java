package com.aurionpro.model;

public class Laptop {
	private String ram;
	private String hdd;
	private String keyboard;
	private String touchScreen;

	
	
	
	
	
	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public String getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}

	public String getTouchScreen() {
		return touchScreen;
	}

	public void setTouchScreen(String touchScreen) {
		this.touchScreen = touchScreen;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", keyboard=" + keyboard + ", touchScreen=" + touchScreen + "]";
	}
	
	
	

}
