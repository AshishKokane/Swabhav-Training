package com.aurionpro.test;

public class MultiThreadExtend extends Thread {

	private int threadno;

	public MultiThreadExtend(int threadno) {
		this.threadno = threadno;

	}

	@Override
	public void run() {

		for (int i = 1; i < 5; i++) {
			System.out.println(i + "  printed by Thread no:-" + threadno);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

	}

}
