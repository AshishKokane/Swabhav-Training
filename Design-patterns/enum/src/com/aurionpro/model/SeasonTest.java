package com.aurionpro.model;

import java.util.EnumSet;

public class SeasonTest {

	public static void main(String[] args) {
	
		
		for (Season s : Season.values())  
			System.out.println(s+" "+s.value);  
		
		System.out.println(EnumSet.range(Season.WINTER,Season.SUMMER));
		
		System.out.println(Season.FALL.getValue());
		
		
	}

}
