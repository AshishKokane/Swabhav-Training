package com.aurionpro.model;

import com.aurionpro.test.Advertisement;
import com.aurionpro.test.Idisplay;
import com.aurionpro.test.Monitor;
import com.aurionpro.test.Projector;
import com.aurionpro.test.Telivision;

public class AdvertisementTest {

	public static void main(String[] args) {

		Advertisement obj = new Advertisement();

		Idisplay monitor = new Monitor();
		obj.setdisplayModule(monitor);
		obj.showAdvertisement();

		Idisplay telivision = new Telivision();
		obj.setdisplayModule(telivision);
		obj.showAdvertisement();

		Idisplay projector = new Projector();
		obj.setdisplayModule(projector);
		obj.showAdvertisement();

	}

}
