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

	public boolean deposit(double ammount) {

		if (ammount > 0) {
			balance = balance + ammount;
			return true;
		}

		else
			return false;

	}

	public boolean withdraw(double ammount) {

		if ((balance - ammount) < 1000)
			return false;

		else {
			balance = balance - ammount;
			return true;
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
