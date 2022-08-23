package com.aurionpro.model;

public class TaxCalulator {

	ILogger logger;
	
	

	public TaxCalulator(ILogger logger) {
		super();
		this.logger = logger;
	}
	
public double calculateTax(int amount, int taxRate) {
	double tax = 0;
	try {
		
		tax = amount/taxRate;
	} catch (Exception e) {
	
		logger.logs(e.getLocalizedMessage());
		

	}
	
		
	return tax;
	
}
	
}
