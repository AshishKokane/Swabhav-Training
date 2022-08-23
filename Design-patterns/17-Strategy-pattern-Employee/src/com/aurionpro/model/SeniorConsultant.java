package com.aurionpro.model;

public class SeniorConsultant implements IRole{

	@Override
	public String responsibility() {
		
		return "review code";
	}

	@Override
	public String description() {
		
		return "SeniorConsultant";
	}

}
