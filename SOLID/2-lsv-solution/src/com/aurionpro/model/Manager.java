package com.aurionpro.model;

public class Manager implements IWorkable,IEatable{

	@Override
	public void startWork() {
	System.out.println("manager starts work....");
		
	}

	@Override
	public void stopWork() {
		System.out.println("manager stops work....");
		
	}

	@Override
	public void startEat() {
		System.out.println("manager starts eating ....");
		
	}

	@Override
	public void stopEat() {
		System.out.println("manager stops eating ....");
		
	}

}
