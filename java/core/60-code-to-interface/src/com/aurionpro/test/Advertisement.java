package com.aurionpro.test;

public class Advertisement {

	Idisplay disp;

	public void setdisplayModule(Idisplay obj) {
		disp = obj;

	}

	public void showAdvertisement() {

		disp.display();

	}

}
