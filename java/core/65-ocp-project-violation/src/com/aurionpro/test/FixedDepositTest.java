package com.aurionpro.test;

import com.aurionpro.model.FestivalType;
import com.aurionpro.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit("abc", 100000, 2, FestivalType.DIWALI);

		double simpleInterest;
		simpleInterest = fd.calculateSimpleInterest();

		System.out.println(fd);

		System.out.println("Simple Interset : " + simpleInterest);
		System.out.println("duration is in years");
		System.out.println("------------------------------------------------------------------");

		FixedDeposit fd1 = new FixedDeposit("abc", 10000, 2, FestivalType.OTHERS);

		simpleInterest = fd1.calculateSimpleInterest();

		System.out.println(fd1);

		System.out.println("Simple Interset : " + simpleInterest);
		System.out.println("duration is in years");

	}

}
