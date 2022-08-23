package com.aurionpro.model;

public abstract class CarDecorator implements ICarservice {

	ICarservice carObj;
	

	
	public CarDecorator(ICarservice carObj) {
		super();
		this.carObj = carObj;
	}

	
	
	
	@Override
	public String getServiceDetails() {
		
		return carObj.getServiceDetails();
	}

	@Override
	public double getCost() {
		
		return carObj.getCost();
	}

}
