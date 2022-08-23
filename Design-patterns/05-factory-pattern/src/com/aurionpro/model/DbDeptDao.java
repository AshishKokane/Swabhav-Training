package com.aurionpro.model;

public class DbDeptDao implements IDao {

	@Override
	public void save() {
		System.out.println(" Dept save in DB");
	}

}
