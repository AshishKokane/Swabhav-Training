package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.InsufficeintFunds;
import com.aurionpro.model.InvalidDepositAmmount;

public class AccountTest {

	public static void main(String[] args) throws InsufficeintFunds {

		Account acc;
		try {
			acc = new Account(101, 1000, "ABC");
			acc.withdraw(30000);
			acc.deposit(-1);
			System.out.println(acc);
		} catch (InvalidDepositAmmount e) {
			System.out.println(e.getMessage());
		}

		finally {
			System.out.println("finally block");
		}

	}

}
