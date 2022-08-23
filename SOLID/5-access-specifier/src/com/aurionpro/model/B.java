package com.aurionpro.model;

public class B extends A
{
	public static void main(String[] args) {
		B obj2 = new B();
		obj2.displayProtected();
		System.out.println(obj2.name1);
		System.out.println(obj2.name2);
	}

	//The method display in class A is protected and class B is inherited from class A
	//and this protected method is then accessed by creating an object of class B.
	
	
	//Note: We cannot declare classes or interfaces protected in Java.

}
