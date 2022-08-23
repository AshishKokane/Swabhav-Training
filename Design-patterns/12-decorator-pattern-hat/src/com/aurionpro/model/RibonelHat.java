package com.aurionpro.model;

public class RibonelHat extends HatDecorator {

	public RibonelHat(IHAT hat) {
		super(hat);
		
	}
	
	
	@Override
	public String getDescription() {
	
		return super.getDescription() + "\n Ribonel hat Description ";
	}

	@Override
	public String getName() {
	
		return super.getName() + "\n Ribonel hat ";
	}

	@Override
	public double getPrice() {
	
		return 500 + super.getPrice();
	}

}
