package com.aurionpro.test;

import com.aurionpro.model.LogType;
import com.aurionpro.model.TaxCalulator;

public class TaxTest {

	
	public static void main(String[] args) {
		TaxCalulator tax = new TaxCalulator(LogType.FILE);
		double amounttax = tax.calculateTax(200, 0);
		
		System.out.println(amounttax);
	}
}
