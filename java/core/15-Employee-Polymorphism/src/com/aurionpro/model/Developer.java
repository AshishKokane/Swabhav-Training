package com.aurionpro.model;

public class Developer extends Employee {

	public double pa;
	public double ot;

	public Developer(int employeeNumber, String empName, double basicSalary) {
		super(employeeNumber, empName, basicSalary);

		this.pa = (basicSalary * 0.30);
		this.ot = (basicSalary * 0.20);

	}

	@Override
	public double calculateAnnualCTC() {

		return (basicSalary + ot + pa) * 12;

	}

	public double getPa() {
		return pa;
	}

	public double getOt() {
		return ot;
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
	protected double getPerks() {
		// TODO Auto-generated method stub
		return 0;
	}

}
