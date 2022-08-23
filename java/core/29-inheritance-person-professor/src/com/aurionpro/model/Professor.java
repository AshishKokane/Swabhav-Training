package com.aurionpro.model;

public class Professor extends Person implements Isalary {

	double baiscSalary;

	public Professor(int id, String address, String dob, double baiscSalary) {
		super(id, address, dob);
		this.baiscSalary = baiscSalary;
	}

	public double getBaiscSalary() {
		return baiscSalary;
	}

	@Override
	public double calculateSalary() {
		return baiscSalary * 12;

	}

	@Override
	public String toString() {
		return "Professor [baiscSalary=" + baiscSalary + ", id=" + id + ", address=" + address + ", dob=" + dob + "]";
	}

}
