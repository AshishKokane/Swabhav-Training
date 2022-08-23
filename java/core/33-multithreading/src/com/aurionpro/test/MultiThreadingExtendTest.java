package com.aurionpro.test;

public class MultiThreadingExtendTest {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			MultiThreadExtend myThread = new MultiThreadExtend(i);

			myThread.start();

		}

//		MultiThreadThing myThread = new MultiThreadThing(1);
//		MultiThreadThing myThread2 = new MultiThreadThing(2);
//		myThread.start();
//		myThread2.start();

	}

}
