package com.aurionpro.model;

public class BMI {
	Person person;
	double bmi;

	public BMI(Person person) {

		this.person = person;
		this.bmi = calculateBMI();

	}

	public Person getPerson() {
		return person;
	}

	public double getBmi() {
		return bmi;
	}

	private double calculateBMI() {

		double height = person.getHeight();
		double weight = person.getWeight();
		height = height * 0.01; // converting height to meter

		double bmi = weight / (height * height);

		return bmi;

	}

	public String getBodyType() {

		double bmi = calculateBMI();

		if (bmi < 18.5)
			return "UnderWeight";

		if (bmi > 18.5 && bmi < 24.9)
			return "Normal healthy weight";

		if (bmi > 25.09 && bmi < 29.9)
			return "Overweight";

		if (bmi > 30 && bmi < 24.9)
			return "Obese";

		return "Morbidly obese";

	}

	@Override
	public String toString() {
		return "BMI [person=" + person + "]";
	}

}
