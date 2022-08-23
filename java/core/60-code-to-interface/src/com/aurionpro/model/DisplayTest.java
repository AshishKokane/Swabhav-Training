package com.aurionpro.model;

import com.aurionpro.test.Monitor;
import com.aurionpro.test.Projector;
import com.aurionpro.test.Telivision;

public class DisplayTest {

	public static void main(String[] args) {

		Monitor monitor = new Monitor();
		monitor.display();

		Telivision telivision = new Telivision();
		telivision.display();

		Projector projector = new Projector();
		projector.display();

	}

}
