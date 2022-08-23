package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LineItemTest {
	
	
	Product procuct1 = new Product(101, "phone", 10000, 5);
	LineItem item1 = new LineItem(101, 2, procuct1);



	@Test
	@DisplayName(" total price with 5% discount on 2 items ")
	void testCalculateLineItemCost() {
		double Expected = 19000.0;
		double Actual =item1.calculateLineItemCost();

		assertEquals(Expected, Actual);
	}
	
	
	
}
