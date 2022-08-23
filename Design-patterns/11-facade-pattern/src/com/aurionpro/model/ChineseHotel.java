package com.aurionpro.model;

public class ChineseHotel implements IHotel {

	@Override
	public IMenu getHotel() {
	
		return new ChineseMenu();
	}

}
