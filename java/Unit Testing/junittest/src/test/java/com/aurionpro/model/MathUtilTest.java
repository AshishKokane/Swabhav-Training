package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class MathUtilTest {

	MathUtil util;
@Disabled
@Test
void test() {
//	System.out.println("hi");
	fail("this test failed");
}

	@BeforeAll
	void testBeforeAll() {
		System.out.println("print b4 all");
	}

	@BeforeEach
	void testBeforeEach() {
		util = new MathUtil();
		System.out.println("print b4 each all");
	}
	@Disabled
	@Test
	void testAddInt_checkPositiveInteger() {
		int expected = 10;
		int actual = util.addInt(5, 5);
		assertEquals(expected, actual);
	}
	@Disabled
	@Test
	@DisplayName("check addition of positive integer and zero")
	void testAddInt_checkPositiveIntegerAndZero() {
		int expected = 5;
		int actual = util.addInt(5, 0);
		assertEquals(expected, actual);

	}
	@Disabled
	@Test
	void testAddInt_checkNegativeInteger() {
		int expected = -10;
		int actual = util.addInt(-5, -5);
		assertEquals(expected, actual);
	}
	
	
	@Test
	@DisplayName("check division by positive integer")
	void testDivInt_checkPositiveInteger() {
		int expected = 5;
		int actual = util.divInt(10, 2);
		assertEquals(expected, actual);

	}
	
	@Test
	@DisplayName("check division by negative integer")
	void testDivInt_checknegativeInteger() {
		int expected = -5;
		int actual = util.divInt(10, -2);
		assertEquals(expected, actual);
		assertTrue(expected==actual);
	}
	
//
//	@Test
//	@DisplayName("check division by 0")
//	void testDivInt_cheeckDivideByZero() {
//		int expected = 10;
//		int actual = util.divInt(10, 0);
//		assertEquals(expected, actual);
//		assertTrue(expected==actual);
//	}
	

	
	@Test
	@DisplayName("check division by zero exception")
	void testDivInt_checkArithmethicException() {
	assertThrows(ArithmeticException.class, ()->util.divInt(10, 0));
	}
	
	
	@Test
	@DisplayName("array equals")
	void testEqualArrays() {
		int [] a1 = {10,20,30,40};
		int [] a2 = {10,20,30,40};
		
		assertArrayEquals(a1, a2);
	}

}
