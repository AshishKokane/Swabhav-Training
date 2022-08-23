package com.aurionpro.test;

public class InvoicePrint {

	public void printInvoice(Invoice inv) {
		System.out.println("id :" + inv.getId());
		System.out.println("Discription : " + inv.getDescription());
		System.out.println("TAX: " + inv.calculateTax());
		System.out.println("Discount : " + inv.calculateDiscount());
		System.out.println("Total : " + inv.calculateTotal());
	}

}
