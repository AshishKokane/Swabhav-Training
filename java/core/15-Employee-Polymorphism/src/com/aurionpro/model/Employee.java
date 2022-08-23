package com.aurionpro.model;

public abstract class Employee {

	public int employeeNumber;
	public String empName;
	public double basicSalary;

	public Employee(int employeeNumber, String empName, double basicSalary) {

		this.employeeNumber = employeeNumber;
		this.empName = empName;
		this.basicSalary = basicSalary;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public abstract double calculateAnnualCTC();

	public abstract double getHra();

	public abstract double getDa();

	public abstract double getTa();

	protected abstract double getPa();

	protected abstract double getOt();

	protected abstract double getPerks();

	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", empName=" + empName + ", basicSalary=" + basicSalary
				+ "]";
	}

}
