package com.aurionpro.model;

public class PremiumHat implements IHAT {

	@Override
	public String getDescription() {

		return "\n premium hat description ";
	}

	@Override
	public String getName() {

		return "\n premium hat name ";
	}

	@Override
	public double getPrice() {

		return 2500;
	}

}
