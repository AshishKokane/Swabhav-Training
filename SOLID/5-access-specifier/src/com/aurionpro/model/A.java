package com.aurionpro.model;

public class A {
	
	private String name = "ashish";
	public String name1 = "abc";
	protected  String name2 = "xyz";
	
	void displayName() {
		System.out.println(name);
	}


	//using any access modifiers i.e. 
	//having default access modifier are accessible only within the same package.
	
	


	public void display() {
		
		A aa = new A();
		aa.displayName();
		//aa.displayPrivateMethod();
		System.out.println("public method");
		
	}
	
	private void displayPrivateMethod() {
		
		System.out.println("private method");
		
	}
	
	//The methods or data members declared as private are
	//accessible only within the class in which they are declared.
	//Any other class of the same package will not be able to access these members.
	
	
	
	
	protected void displayProtected() {
		System.out.println("protected method ");
		
	} 
	
	//The methods or data members declared as protected are accessible 
	//within the same package or subclasses in different packages.
}

