package com.aurionpro.test;

import com.aurionpro.model.AutoType;
import com.aurionpro.model.AutomobileFactory;
import com.aurionpro.model.IAutomobile;

public class AutomobileTest {

	public static void main(String[] args) {
		AutomobileFactory automobile = new  AutomobileFactory();
		IAutomobile auto =  automobile.makeAutomobile(AutoType.TESLA);
		auto.start();
		auto.stop();
				

	}

}
