package com.aurionpro.test;

import com.aurionpro.model.INotification;
import com.aurionpro.model.NotificationService;

public class NotificationTest {

	public static void main(String[] args) {
		
		NotificationService notificationservice = new NotificationService();
		INotification notification = notificationservice.createNotification("SMS");
		notification.notifyMessage();
		
				
		

	}

}
