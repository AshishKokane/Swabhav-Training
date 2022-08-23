package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.EmailNotification;
import com.aurionpro.model.SmsNotification;

public class AccountTest {
	
	public static void main(String[] args) {
		Account acc = new Account(1010110, "ashish", 100000);
		acc.registerNotifier(new EmailNotification());
		acc.deposit(500);
		acc.withdraw(50000000);
		
		System.out.println();
		
		Account acc1 = new Account(1010110, "dhruv", 1000);
		acc1.registerNotifier(new SmsNotification());
		acc1.registerNotifier(new EmailNotification());
		acc1.deposit(500);
	
	}

}
