package com.aurionpro.model;

public class HatDecorator implements IHAT {

	IHAT hat;

	public HatDecorator(IHAT hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getDescription() {
	
		return hat.getDescription();
	}

	@Override
	public String getName() {
	
		return hat.getName();
	}

	@Override
	public double getPrice() {
	
		return hat.getPrice();
	}

}
