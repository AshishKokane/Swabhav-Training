package com.aurionpro.model;

public class Manager extends Employee {

	public double hra;
	public double da;
	public double ta;

	public Manager(int employeeNumber, String empName, double basicSalary) {
		super(employeeNumber, empName, basicSalary);

		this.hra = (basicSalary * 0.30);
		this.da = (basicSalary * 0.20);
		this.ta = (basicSalary * 0.10);

	}

	@Override
	public double calculateAnnualCTC() {

		return (basicSalary + hra + da + ta) * 12;

	}

	public double getHra() {
		return hra;
	}

	public double getDa() {
		return da;
	}

	public double getTa() {
		return ta;
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

	@Override
	protected double getPerks() {
		// TODO Auto-generated method stub
		return 0;
	}

}
