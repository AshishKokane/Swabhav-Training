package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private int accNumber;
	private String name;
	private double balance;

	private List<INotifier> notification = new ArrayList();

	public Account(int accNumber, String name, double balance) {
		super();
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;

	}

	public int getAccNumber() {
		return accNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public List<INotifier> getNotification() {
		return notification;
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;

			for (INotifier n : notification) {
				n.sendNotification(this, amount, "withdraw");

			}
		}

		else
			System.out.println("Widhraw eror invalid amount :" + balance );

	}

	public void deposit(double amount) {

		if (amount > 0) {
			balance = balance + amount;

			for (INotifier n : notification) {
				n.sendNotification(this, amount, "deposit");

			}
		} 
		
		else
			System.out.println("invalid amount...");

	}

	public void registerNotifier(INotifier notifi) {
		notification.add(notifi);
	}

}
