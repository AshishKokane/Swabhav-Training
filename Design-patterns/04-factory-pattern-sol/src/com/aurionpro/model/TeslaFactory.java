package com.aurionpro.model;

public class TeslaFactory implements IAutomobileFactory {

	private static TeslaFactory instance = null;

	private TeslaFactory() {};

	public static TeslaFactory getInstance() {
		if (instance == null)
			instance = new TeslaFactory();

		return instance;
	}

	@Override
	public Tesla makeAutomobile() {

		return new Tesla();

	}

}
