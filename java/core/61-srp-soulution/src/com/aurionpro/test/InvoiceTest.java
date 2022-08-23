package com.aurionpro.test;

public class InvoiceTest {

	public static void main(String[] args) {

		Invoice invoice = new Invoice("101", "bike", 200, 10, 5);
		// InvoicePrint print = new InvoicePrint();
		// print.printInvoice(invoice);

		invoice.printInvoice();

	}

}
