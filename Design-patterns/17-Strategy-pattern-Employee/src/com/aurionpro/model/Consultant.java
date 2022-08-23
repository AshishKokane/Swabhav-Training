package com.aurionpro.model;

public class Consultant implements IRole{

	@Override
	public String responsibility() {
		
		return "write code";
	}

	@Override
	public String description() {
		
		return "Consultant";
	}

}
