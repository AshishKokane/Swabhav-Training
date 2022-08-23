package com.aurionpro.model;

public class TechLead implements IRole{

	@Override
	public String responsibility() {
		
		return "assign work";
	}

	@Override
	public String description() {
		
		return "TechLead";
	}

}
