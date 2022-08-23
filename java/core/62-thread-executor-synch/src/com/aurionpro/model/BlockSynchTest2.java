package com.aurionpro.model;

import com.aurionpro.test.PrintBlockSynch;
import com.aurionpro.test.SynchBlock;

public class BlockSynchTest2 {

	public static void main(String[] args) {

		PrintBlockSynch numbers = new PrintBlockSynch();

		SynchBlock synch = new SynchBlock(numbers);
		SynchBlock synch2 = new SynchBlock(numbers);

		Thread th1 = new Thread(synch);

		Thread th2 = new Thread(synch2);
		th1.start();
		th2.start();

	}

}
