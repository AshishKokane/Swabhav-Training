package com.aurionpro.test;

public class ThreadTest {

	public static void main(String[] args) {

		Runnable runThread = new Runnable() {

			@Override
			public void run() {
				System.out.println("inside anonymous");

			}
		};

		Thread thread = new Thread(runThread);
		thread.start();

		Runnable runthread1 = () -> {
			System.out.println("inside run lambda ");
		};

		Thread thread2 = new Thread(runthread1);
		thread2.start();

		Runnable runthread2 = ThreadTest::execute;
		runthread2.run();
	}

	public static void execute() {
		System.out.println(" inside Lambda");

	}

}
