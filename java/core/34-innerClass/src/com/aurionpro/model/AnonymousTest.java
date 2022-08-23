package com.aurionpro.model;

import com.aurionpro.test.OuterClass;

public class AnonymousTest {

	public static void main(String[] args) {

		OuterClass outer = new OuterClass() {
			public void show() {
				System.out.println("AnonymousTest class display");

			}
		};

		outer.show();
	}

}
