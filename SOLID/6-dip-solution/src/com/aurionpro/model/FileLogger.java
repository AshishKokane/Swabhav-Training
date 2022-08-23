package com.aurionpro.model;

public class FileLogger implements ILogger {

	@Override
	public void logs(String err) {
		
		System.out.println("log to file error "+ err);
		
	}
}
