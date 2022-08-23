package com.aurionpro.model;

public class OilChange extends CarDecorator {

	public OilChange(ICarservice carObj) {
		super(carObj);
	
	}
	
	@Override
	public double getCost() {
		
		return 700 + super.getCost();
	}
	
	@Override
	public String getServiceDetails() {
		
		return super.getServiceDetails() + "\n Oil Change";
	}

}
