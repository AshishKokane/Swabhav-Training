package com.aurionpro.test;

import com.aurionpro.model.Diwali;
import com.aurionpro.model.FixedDeposit;
import com.aurionpro.model.Holi;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit("abc", 100000, 2, new Diwali());

		double simpleInterest;
		simpleInterest = fd.calculateSimpleInterest();

		System.out.println("Simple interest : " + simpleInterest);
		System.out.println(fd);

		System.out.println("--------------------------------------------------------------------------");

		FixedDeposit fd1 = new FixedDeposit("lmn", 100000, 2, new Holi());

		simpleInterest = fd.calculateSimpleInterest();

		System.out.println("Simple interest : " + simpleInterest);
		System.out.println(fd);

	}

}
