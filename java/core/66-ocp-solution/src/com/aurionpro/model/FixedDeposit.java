package com.aurionpro.model;

public class FixedDeposit {

	private String name;
	private double principal;
	private int duration;
	private IInterest IInterest;

	public FixedDeposit(String name, double principal, int duration, IInterest IInterest) {
		super();
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.IInterest = IInterest;
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

	public IInterest getIInterest() {
		return IInterest;
	}

	public double calculateSimpleInterest() {
		return (principal * duration * IInterest.getInterest()) / 100;

	}

	@Override
	public String toString() {
		return "FixedDeposit [name=" + name + ", principal=" + principal + ", duration=" + duration + ", IInterest="
				+ IInterest + "]";
	}

}
