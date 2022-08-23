package com.aurionpro.model;

public class DbEmpDao implements IDao {

	@Override
	public void save() {
		System.out.println(" Emp save in DB");
	}

}
