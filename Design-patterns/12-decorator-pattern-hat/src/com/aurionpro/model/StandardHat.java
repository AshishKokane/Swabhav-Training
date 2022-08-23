package com.aurionpro.model;

public class StandardHat implements IHAT {

	@Override
	public String getDescription() {

		return "\n Standard Hat Description ";
	}

	@Override
	public String getName() {

		return "\n Standard hat name ";
	}

	@Override
	public double getPrice() {

		return 1500;
	}

}
