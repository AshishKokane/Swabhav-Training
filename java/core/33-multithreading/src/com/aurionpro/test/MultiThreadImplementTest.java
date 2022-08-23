package com.aurionpro.test;

public class MultiThreadImplementTest {

	public static void main(String[] args) {
		for (int i = 1; i < 3; i++) {
			MultiThreadExtend myThread = new MultiThreadExtend(i);
			Thread thread = new Thread(myThread);

			thread.start();

			try {
				thread.join();
			} catch (InterruptedException e) {

			}
		}

	}

}
