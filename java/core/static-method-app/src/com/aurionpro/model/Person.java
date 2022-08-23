package com.aurionpro.model;

public class Person {

	private double height;
	private double weight;
	private String name;
	private GenderOption gender;

	public Person(double height, double weight, String name, GenderOption gender) {

		this.height = height;
		this.weight = weight;
		this.name = name;
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public GenderOption getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Person [height=" + height + ", weight=" + weight + ", name=" + name + ", gender=" + gender + "]";
	}

}
