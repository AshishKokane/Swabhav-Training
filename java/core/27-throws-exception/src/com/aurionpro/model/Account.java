package com.aurionpro.model;

public class Account {

	private int id;

	private double balance;
	private String name;

	public Account(int id, double balance, String name) {

		this.id = id;
		this.balance = balance;

		this.name = name;
	}

	public void deposit(double ammount) {

		if (ammount > 0) {
			balance = balance + ammount;

		}

		else {
			throw new InvalidDepositAmmount("InvalidDeposit Ammount ....!");
		}

	}

	public void withdraw(double ammount) throws InsufficeintFunds {

		if (ammount > balance) {
			throw new InsufficeintFunds("Insufficient Funds....!");

		}

		else {
			balance = balance - ammount;

		}

	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", name=" + name + "]";
	}

}
