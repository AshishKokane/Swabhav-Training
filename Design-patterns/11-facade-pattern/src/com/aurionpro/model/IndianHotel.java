package com.aurionpro.model;

public class IndianHotel implements IHotel {

	@Override
	public IMenu getHotel() {
	
		return new IndianMenu();
	}

}
