package com.aurionpro.model;

public class HatAdapter implements IItem {

	Hat hat;

	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getName() {

		return hat.getShortName();
	}

	@Override
	public double getPrice() {

		return hat.getBasePrice() + hat.getBasePrice() * hat.getGst();
	}

}
