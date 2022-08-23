package com.aurionpro.model;

public abstract class User {

	public FacebookGroupMediator mediator;
	public String name;

	public User(FacebookGroupMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	public abstract void send(String msg);

	public abstract void receive(String msg);

}
