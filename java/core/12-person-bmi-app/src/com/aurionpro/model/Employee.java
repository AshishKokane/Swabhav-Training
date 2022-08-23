package com.aurionpro.model;

public class Employee {

	private int empId;
	private String empName;
	private float empSalary;

	// private static int count;

	public Employee(int empId, String empName, float empSalary) {

		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;

	}

//	private static void empPrintDetails() {
//		System.out.println(empId);
//		System.out.println(empName);
//		System.out.println(empSalary);
//		System.out.println(count);
//
//	}

	private void empPrintDetail() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);

	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

}
