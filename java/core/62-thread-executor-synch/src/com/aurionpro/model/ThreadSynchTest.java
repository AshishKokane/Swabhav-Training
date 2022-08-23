package com.aurionpro.model;

import com.aurionpro.test.SampleNumber;
import com.aurionpro.test.ThreadSynch;

public class ThreadSynchTest {

	public static void main(String[] args) {

		SampleNumber numbers = new SampleNumber();

		ThreadSynch synch = new ThreadSynch(numbers);
		ThreadSynch synch2 = new ThreadSynch(numbers);

		Thread th1 = new Thread(synch);

		Thread th2 = new Thread(synch2);
		th1.start();
		th2.start();

	}

}
