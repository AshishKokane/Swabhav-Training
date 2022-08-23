package com.aurionpro.test;

import com.aurionpro.model.FacebookGroupMediator;
import com.aurionpro.model.FacebookGroupMediatorImpl;
import com.aurionpro.model.User;
import com.aurionpro.model.UserImpl;

public class FacebookClient {

	public static void main(String[] args) {

		FacebookGroupMediator facebookMediator = new FacebookGroupMediatorImpl();
		User Sir = new UserImpl(facebookMediator, "Sir");
		User shubham = new UserImpl(facebookMediator, "shubham");
		User Immanual = new UserImpl(facebookMediator, "Immanual");
		User Ritesh1 = new UserImpl(facebookMediator, "Ritesh1");
		User Ritesh2 = new UserImpl(facebookMediator, "Ritesh2");
		User Rizwan = new UserImpl(facebookMediator, "Rizwan");
		User Shivam = new UserImpl(facebookMediator, "Shivam");
		User Pratik = new UserImpl(facebookMediator, "Pratik");

		facebookMediator.registerUser(Sir);

		facebookMediator.registerUser(shubham);
		facebookMediator.registerUser(Immanual);
		facebookMediator.registerUser(Ritesh1);
		facebookMediator.registerUser(Ritesh2);
		facebookMediator.registerUser(Rizwan);
		facebookMediator.registerUser(Shivam);
		facebookMediator.registerUser(Pratik);



		Sir.send("Do pattern Task HW..  ");

		System.out.println("-----------------------------------------");

	Immanual.send(" yes sir ! ");

	}
}
