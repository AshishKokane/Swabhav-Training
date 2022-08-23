package com.aurionpro.model;

public class Student extends Person {
	BranchType branchtype;

	public Student(int id, String address, String dob, BranchType branchtype) {
		super(id, address, dob);
		this.branchtype = branchtype;

	}

	public BranchType getBranchtype() {
		return branchtype;
	}

	@Override
	public String toString() {
		return "Student [branchtype=" + branchtype + ", id=" + id + ", address=" + address + ", dob=" + dob + "]";
	}

}
