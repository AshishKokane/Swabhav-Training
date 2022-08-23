package com.aurionpro.test;

public class SampleNumber {

	synchronized public void printDetails() {

		for (int i = 0; i <= 2; i++) {

			System.out.println(Thread.currentThread().getName() + "  number: " + i);

		}

		System.out.println("---------------------------");

	}

}
