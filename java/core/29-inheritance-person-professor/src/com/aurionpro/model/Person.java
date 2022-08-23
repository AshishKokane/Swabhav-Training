package com.aurionpro.model;

public class Person {

	public int id;
	public String address;
	public String dob;

	public Person(int id, String address, String dob) {
		super();
		this.id = id;
		this.address = address;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public String getDob() {
		return dob;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", address=" + address + ", dob=" + dob + "]";
	}

}
