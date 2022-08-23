package com.aurionpro.test;

public class Threads implements Runnable {
	private int threadno;

	public Threads(int threadno) {

		this.threadno = threadno;

	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {

			if (i == 0) {
				System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT + "Initilizing thread : "
						+ Thread.currentThread().getName() + ConsoleColors.RESET);

			}
			// Thread.currentThread().getName()
			else {

				System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT + i + " printed by Thread no:-"
						+ Thread.currentThread().getName() + ConsoleColors.RESET);

			}

		}

		// System.out.println();
		System.out.println("---completed thread " + Thread.currentThread().getName());

	}

}
