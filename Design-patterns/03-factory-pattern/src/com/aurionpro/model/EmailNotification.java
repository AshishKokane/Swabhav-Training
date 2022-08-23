package com.aurionpro.model;

public class EmailNotification implements INotification {

	@Override
	public void notifyMessage() {
		System.out.println("sending notification through e-mail.........");
		
	}

}
