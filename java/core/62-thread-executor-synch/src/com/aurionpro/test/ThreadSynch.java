package com.aurionpro.test;

public class ThreadSynch implements Runnable {

	SampleNumber numbers;

	public ThreadSynch(SampleNumber numbers) {

		this.numbers = numbers;
	}

	@Override
	public void run() {

		numbers.printDetails();

	}

}
