package com.aurionpro.test;

public class Printer {

	DelegatePrinter dprint = new DelegatePrinter();

	public void print() {

		dprint.print();
	}

}
