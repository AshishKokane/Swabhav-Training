package com.aurionpro.test;

import com.aurionpro.model.IAutomobile;
import com.aurionpro.model.IAutomobileFactory;
import com.aurionpro.model.bmwFactory;

public class AutomobileTest {

	public static void main(String[] args) {

		IAutomobileFactory factory = bmwFactory.getInstance();
		IAutomobile bmw = factory.makeAutomobile();
		bmw.start();
		bmw.stop();

		System.out.println();
		IAutomobileFactory factory1 = bmwFactory.getInstance();
		IAutomobile bmw1 = factory.makeAutomobile();
		bmw1.start();
		bmw1.stop();

		System.out.println();
		System.out.println(factory1.hashCode());
		System.out.println(factory.hashCode());

	}

}
