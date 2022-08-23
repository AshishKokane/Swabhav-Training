package com.aurionpro.model;

public class HotelReception {
	
	
	public void getIndianMenu(){
	
	IHotel hotel = new IndianHotel();
	IMenu menue =  hotel.getHotel();
	menue.showMenu();

}


	
	
	public void getChineseMenue(){
		
	IHotel hotel = new ChineseHotel();
	IMenu menue = (IMenu) hotel.getHotel();
	menue.showMenu();

}
	
	public void getItalianMenu(){
		
	IHotel hotel = new ItalianHotel();
	IMenu menue = (IMenu) hotel.getHotel();
	menue.showMenu();

}
	
}
