package com.aurionpro.test;


import com.aurionpro.model.DBLogger;
import com.aurionpro.model.FileLogger;
import com.aurionpro.model.ServerLog;
import com.aurionpro.model.TaxCalulator;

public class TaxTest {

	
	public static void main(String[] args) {
		TaxCalulator tax = new TaxCalulator(new ServerLog());
		double amounttax = tax.calculateTax(200, 0);
		
		System.out.println(amounttax);
	}
}
