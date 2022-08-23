package com.aurionpro.test;

import com.aurionpro.model.CarService;
import com.aurionpro.model.OilChange;
import com.aurionpro.model.wheelAlign;

public class CarServiceTest {

	public static void main(String[] args) {
		
		CarService  car = new CarService();
		OilChange carOil = new OilChange(car);
		carOil.getServiceDetails();
		carOil.getCost();
		
		wheelAlign wheel = new wheelAlign(carOil);
		
		System.out.println(wheel.getCost());
		System.out.println(wheel.getServiceDetails());
		

	}

}
