package com.aurionpro.model;

public interface Demo {

	void display();

	default void show() {

		System.out.println("Default show method");
	}

}
