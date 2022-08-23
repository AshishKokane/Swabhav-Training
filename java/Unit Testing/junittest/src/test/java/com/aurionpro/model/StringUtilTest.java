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

public class StringUtilTest {


	
	
	StringUtil util;

	@BeforeAll
	void testBeforeAll() {
		 util = new StringUtil();
	}

	@Test
	@DisplayName("String truncate A in first 2 index")
	void testTruncateAInFirst2Place() {
		String Expected = "BC";
		String Actual = util.truncateAInFirst2Place("aabc").toUpperCase();

		assertEquals(Expected, Actual);
	}
	
	
	
	
	@Test
	@DisplayName("String truncate A in 1st index")
	void testTruncateAInFirstIndex() {
		String Expected = "DBC";
		String Actual = util.truncateAInFirst2Place("adbc").toUpperCase();

		assertEquals(Expected, Actual);
	}
	
	@Test
	@DisplayName("String truncate A in second index")
	void testTruncateAInsecondIndex() {
		String Expected = "BBC";
		String Actual = util.truncateAInFirst2Place("babc").toUpperCase();

		assertEquals(Expected, Actual);
	}
	
	@Test
	@DisplayName("1st and last 2 index not same  abcdcb")
	void testcheckFirstandLast2NotEqual() {
		
		Boolean Expected = false;
		Boolean Actual = util.checkFirstandLast2Equal("abcdcb");

		assertEquals(Expected, Actual);
		
	}
	
	@Test
	@DisplayName("1st and last 2 index same aBcdAb")
	void testcheckFirstandLast2Equal() {
		
		Boolean Expected = true;
		Boolean Actual = util.checkFirstandLast2Equal("aBcdAb");

		assertEquals(Expected, Actual);
		
	}

}
