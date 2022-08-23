package com.aurionpro.model;

public class ItalianHotel implements IHotel {

	@Override
	public IMenu getHotel() {
	
		return new ItalianMenu();
	}

}
