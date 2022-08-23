package com.aurionpro.model;

public class NotificationService {
	
	
	public INotification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
       
        switch (channel) {
        case "SMS":
            return new SmsNotification();
        case "EMAIL":
            return new EmailNotification();
        case "PUSH":
            return new PushNotification();
        default:
            throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }

}
