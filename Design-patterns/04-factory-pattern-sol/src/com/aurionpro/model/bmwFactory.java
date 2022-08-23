package com.aurionpro.model;

public class bmwFactory implements IAutomobileFactory {
	
	
	 private static bmwFactory instance = null;
	 
	 private bmwFactory() {};
	 
	 
	 public static bmwFactory getInstance()
	    {
	        if (instance == null)
	        	instance = new bmwFactory();
	  
	        return instance;
	    }

	@Override
	public BMW makeAutomobile() {
		
		return new BMW();
		
	}

}
