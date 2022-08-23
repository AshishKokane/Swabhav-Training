package com.aurionpro.model;

public class SmsNotification implements INotifier {


	@Override
	public void sendNotification(Account account, double amount, String string) {
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("Sms Notification Account no  " + account.getAccNumber());
		System.out.println(amount + " " + string + " Successfully " );
		System.out.println("current balance is "+ account.getBalance());
		
	}
}
