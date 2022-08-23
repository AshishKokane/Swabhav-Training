package com.aurionpro.test;

public class PrintBlockSynch {

	public void printDetails() {

		synchronized (this) {

			for (int j = 0; j <= 2; j++) {

				System.out.println(Thread.currentThread().getName() + " synch block number: " + j);
			}

			System.out.println("-------------------------------");

		}

	}

}
