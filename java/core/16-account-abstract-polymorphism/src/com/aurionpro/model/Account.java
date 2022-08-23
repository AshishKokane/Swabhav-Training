package com.aurionpro.model;

public class Account {

	private int accountNumber;

	private double balance;
	private String name;

	public Account(int id, double balance, String name) {

		this.accountNumber = id;
		this.balance = balance;

		this.name = name;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void deposit(double ammount) {

		if (ammount > 0) {
			balance = balance + ammount;

		}

		else {
			System.out.println("ammount not valid");
		}

	}

	public void withdraw(double ammount)

	{

		if ((balance - ammount) < 500)
			System.out.println("insufficent balance");

		else {
			balance = balance - ammount;

		}

	}

	public int getId() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Account [id=" + accountNumber + ", balance=" + balance + ", name=" + name + "]";
	}

}
