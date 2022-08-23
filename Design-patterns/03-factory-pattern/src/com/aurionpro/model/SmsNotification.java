package com.aurionpro.model;

public class SmsNotification implements INotification{

	@Override
	public void notifyMessage() {
		System.out.println("sending notification through SMS.........");
		
	}
}
