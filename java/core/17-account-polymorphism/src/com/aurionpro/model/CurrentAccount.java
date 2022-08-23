package com.aurionpro.model;

public class CurrentAccount extends Account {

	private static final int Overdraft = 50000;

	public CurrentAccount(int id, double balance, String name) {
		super(id, balance, name);

	}

	@Override
	public void withdraw(double ammount) {

		if (this.getBalance() - ammount < -Overdraft) {
			System.out.println("insufficient bal");
		} else {
			this.setBalance(this.getBalance() - ammount);
		}
	}

}
