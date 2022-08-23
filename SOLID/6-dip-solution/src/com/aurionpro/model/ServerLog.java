package com.aurionpro.model;

public class ServerLog implements ILogger {

	@Override
	public void logs(String err) {
		System.out.println("server error");
		
	}

}
