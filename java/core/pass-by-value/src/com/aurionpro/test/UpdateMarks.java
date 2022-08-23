package com.aurionpro.test;

public class UpdateMarks {

	public static void main(String[] args) {
		int marks[] = { 50, 60, 70, 80 };

		System.out.println(" before calling method");
		for (int m : marks) {
			System.out.print(" " + m + " ");
		}

		updateMarkstoZero(marks);
		System.out.println("");

		System.out.println(" after calling method");
		for (int m : marks) {
			System.out.print(" " + m + " ");
		}

	}

	public static void updateMarkstoZero(int[] marks) {

		for (int i = 0; i < marks.length; i++) {
			marks[i] = 0;

		}

	}

}
