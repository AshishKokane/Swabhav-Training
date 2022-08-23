package com.aurionpro.test;

public class MultiThreadImplement implements Runnable {

	private int threadno;

	public MultiThreadImplement(int threadno) {
		this.threadno = threadno;

	}

	@Override
	public void run() {

		for (int i = 0; i <= 5; i++) {
			System.out.println(i + "  printed by Thread no:-" + threadno);
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {

		}

	}

}
