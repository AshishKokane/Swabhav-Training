package com.aurionpro.test;

import com.aurionpro.model.GoldenHat;
import com.aurionpro.model.HatDecorator;
import com.aurionpro.model.PremiumHat;
import com.aurionpro.model.RibonelHat;
import com.aurionpro.model.StandardHat;

public class HatTest {
	public static void main(String[] args) {

		PremiumHat prHat = new PremiumHat();

		GoldenHat gold = new GoldenHat(prHat);

		System.out.println(gold.getDescription() + "\n" + gold.getName() + "\n" + gold.getPrice());

	}

}
