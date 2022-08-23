package com.aurionpro.model;

public class DBLogger implements ILogger {
	


	@Override
	public void logs(String err) {
		System.out.println("log to db error "+ err);
		
	}

}
