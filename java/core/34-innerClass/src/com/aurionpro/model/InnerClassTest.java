package com.aurionpro.model;

import com.aurionpro.test.OuterClass;

public class InnerClassTest {
	public static void main(String[] args) {

		OuterClass outerObj = new OuterClass();
		outerObj.show();

		// OuterClass.InnerClass innerObj = outerObj.new InnerClass();
		// innerObj.show();

		OuterClass.InnerClass innerObj = new OuterClass.InnerClass();
		innerObj.show();

		System.out.println(outerObj.a);

	}

}
