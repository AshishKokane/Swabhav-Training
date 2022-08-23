package com.aurionpro.model;

public class Robot implements IWorkable {

	@Override
	public void startWork() {
	System.out.println("Robot starts work....");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Robot stops work....");
		
	}

}