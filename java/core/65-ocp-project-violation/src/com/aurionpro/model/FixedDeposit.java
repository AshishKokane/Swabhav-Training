package com.aurionpro.model;

public class FixedDeposit {

	private String name;
	private double principal;
	private int duration;
	private FestivalType festival;

	public FixedDeposit(String name, double principal, int duration, FestivalType festival) {
		super();
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
	}

	public String getName() {
		return name;
	}

	public double getPrincipal() {
		return principal;
	}

	public int getDuration() {
		return duration;
	}

	public FestivalType getFestival() {
		return festival;
	}

	public double getInterestRate() {
		if (festival == FestivalType.DIWALI)
			return 7;

		if (festival == FestivalType.CHRISTMAS)
			return 8;

		if (festival == FestivalType.EID)
			return 9;

		if (festival == FestivalType.NEWYEAR)
			return 10;

		return 6;

	}

	public double calculateSimpleInterest() {
		return (principal * duration * getInterestRate()) / 100;

	}

	@Override
	public String toString() {
		return "FixedDeposit [name=" + name + ", principal=" + principal + ", duration=" + duration + ", festival="
				+ festival + "]";
	}

}
