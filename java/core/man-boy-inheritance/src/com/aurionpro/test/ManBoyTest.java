package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Infant;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;

public class ManBoyTest {

	public static void main(String[] args) {

		case1();// reference and object of same type(parent)
		case2(); // reference and object of same type(child)
		case3(); // reference of Parent and object of child
		case4(); // reference of child and object of parent
		case5(); // polymorphism
		case6();

	}

	private static void case1() {

		Man man = new Man();
		man.play();
		man.read();

	}

	private static void case2() {
		Boy boy = new Boy();
		boy.read();
		boy.play();

	}

	private static void case3() {
		Man man = new Kid();
		man.play();
		man.read();
	}

	private static void case4() {
//		Kid kid = new Man();
//		kid.play();
//		kid.read();    // error
	}

	private static void case5() {

		isAtPark(new Boy());
		isAtPark(new Infant());
		isAtPark(new Man());
		isAtPark(new Kid());

	}

	private static void case6() {

		Object obj;
		obj = 10;
		System.out.println(obj.getClass());
		obj = "ABCD";
		System.out.println(obj.getClass());
		obj = 10 < 20;
		System.out.println(obj.getClass());
	}

	private static void isAtPark(Man man) {

		man.play();

	}

}
