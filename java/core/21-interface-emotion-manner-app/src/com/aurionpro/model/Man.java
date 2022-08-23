package com.aurionpro.model;

public class Man implements IMannerable, IEmotionable {

	@Override
	public void cry() {
		System.out.println("man cries");

	}

	@Override
	public void laugh() {
		System.out.println("man laugh");
	}

	@Override
	public void greet() {
		System.out.println("man greets");

	}

	@Override
	public void depart() {
		System.out.println("man departs");

	}

}
