package com.aurionpro.test;

import java.util.Date;

public class Employee2 {

	private int empId;
	private String empName;
	private double empSalary;
	private Date date;
	// private Date date;

	public Employee2(int empId, String empName, double empSalary, Date date) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;

		this.date = date;

	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public Date getDate() {
		return date;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", date=" + date
				+ "]";
	}

}
