package com.aurionpro.model;

public class wheelAlign extends CarDecorator {

	public wheelAlign(ICarservice carObj) {
		super(carObj);
	
	}
	
	
	
	@Override
	public double getCost() {
		
		return 500 + super.getCost();
	}
	
	@Override
	public String getServiceDetails() {
		
		return super.getServiceDetails() + "\n wheel align ";
	}


}
