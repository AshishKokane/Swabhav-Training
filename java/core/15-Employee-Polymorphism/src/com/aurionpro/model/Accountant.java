package com.aurionpro.model;

public class Accountant extends Employee {

	public double perks;

	public Accountant(int employeeNumber, String empName, double basicSalary) {
		super(employeeNumber, empName, basicSalary);

		this.perks = (basicSalary * 0.50);

	}

	@Override
	public double calculateAnnualCTC() {

		return (basicSalary + perks) * 12;

	}

	public double getPerks() {
		return perks;
	}

	@Override
	public double getHra() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getDa() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTa() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double getPa() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double getOt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
