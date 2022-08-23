package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {

		Account acc = new Account(101, 100000, "ABC");

		System.out.println(acc);

		printWithdrawlTransaction(acc.withdraw(2000), acc);

		printDepositTransactionStatus(acc.deposit(4000), acc);

	}

	private static void printDepositTransactionStatus(boolean deposit, Account acc) {
		if (deposit) {
			System.out.println("Deposit successful");
			printAccDetails(acc);

		}

		else
			System.out.println("transaction failed: could not complete deposit");

	}

	private static void printWithdrawlTransaction(boolean withdraw, Account acc) {
		if (withdraw) {
			System.out.println("withdrawl successful");
			printAccDetails(acc);
		} else
			System.out.println("transaction failed: could not complete withdrawl");

	}

	private static void printAccDetails(Account acc) {
		System.out.println("------------------------------");
		System.out.println("Account no: " + acc.getId());

		System.out.println("Account holder name: " + acc.getName());

		System.out.println("Account balance: " + acc.getBalance());
		System.out.println("------------------------------");
	}

}
