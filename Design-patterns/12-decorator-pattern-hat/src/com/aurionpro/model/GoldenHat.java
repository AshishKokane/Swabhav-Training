package com.aurionpro.model;

public class GoldenHat extends HatDecorator {

	public GoldenHat(IHAT hat) {
		super(hat);
		
	}
	
	
	@Override
	public String getDescription() {
	
		return super.getDescription() + " \n Golden Hat Description ";
	}

	@Override
	public String getName() {
	
		return super.getName() + " \n Golden Hat ";
	}

	@Override
	public double getPrice() {
	
		return 600 + super.getPrice();
	}

}
