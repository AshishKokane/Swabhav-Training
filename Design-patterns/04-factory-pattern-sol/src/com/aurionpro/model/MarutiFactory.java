package com.aurionpro.model;

public class MarutiFactory implements IAutomobileFactory {
	
	
	private static MarutiFactory instance = null;
	 
	private MarutiFactory() {};
		
	 public static MarutiFactory getInstance()
	    {
	        if (instance == null)
	        	instance = new MarutiFactory();
	  
	        return instance;
	    }

	@Override
	public Maruti makeAutomobile() {
		
		return new Maruti();
		
	}

}
