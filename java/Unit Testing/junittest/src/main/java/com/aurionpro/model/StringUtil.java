package com.aurionpro.model;

public class StringUtil {

	String truncateAInFirst2Place(String str) {

		StringBuilder sb = new StringBuilder(str);
		
		if(str.subSequence(0, 2).equals("aa")) {
			return str.substring(2);
		}

		if (sb.charAt(0) == 'a') {
			sb.deleteCharAt(0);

		}

		if (sb.charAt(1) == 'a') {
			sb.deleteCharAt(1);
		}
		
		return sb.toString();

	}
	
	
	Boolean checkFirstandLast2Equal(String str) {

	

		if (((String) str.subSequence(0, 2)).equalsIgnoreCase((String) str.subSequence(str.length()-2, str.length()))) {
			return true;

		}
		return false;

	
	}

}
