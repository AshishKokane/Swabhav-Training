package com.aurionpro.model;

public class AccountTest {

	public static void main(String[] args) {

		SavingAccount saving = new SavingAccount(101, 600, "abc");

		saving.withdraw(10000);

		printAccountDetails(saving);
		System.out.println("---------------------------------");
		saving.deposit(5000);
		printAccountDetails(saving);
		System.out.println("---------------------------------");
		CurrentAccount current = new CurrentAccount(102, 100, "LMN");
		current.withdraw(50000);
		printAccountDetails(current);

	}

	private static void printAccountDetails(Account saving) {
		System.out.println("acc_no =" + saving.getId());
		System.out.println("acc_holder_name =" + saving.getName());
		System.out.println("acc_balance =" + saving.getBalance());
	}

}
