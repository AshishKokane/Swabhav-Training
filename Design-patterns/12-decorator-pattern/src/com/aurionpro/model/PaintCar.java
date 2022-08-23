package com.aurionpro.model;

public class PaintCar extends CarDecorator{

	public PaintCar(ICarservice carObj) {
		super(carObj);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public double getCost() {
		
		return 600 + super.getCost();
	}
	
	@Override
	public String getServiceDetails() {
		
		return "car paint " +super.getServiceDetails();
	}

}
