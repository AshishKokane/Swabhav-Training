package com.aurionpro.test;

public class SynchBlock implements Runnable {

	PrintBlockSynch numbers;

	public SynchBlock(PrintBlockSynch numbers) {

		this.numbers = numbers;
	}

	@Override
	public void run() {

		numbers.printDetails();

	}

}
