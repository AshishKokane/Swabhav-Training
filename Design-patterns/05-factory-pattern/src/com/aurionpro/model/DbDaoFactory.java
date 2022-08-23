package com.aurionpro.model;

public class DbDaoFactory implements IDaoAbstractfactory {

	@Override
	public IDao createDao(String str) {

		if (str == "emp")
			return new DbEmpDao();

		if (str == "dept")
			return new DbDeptDao();

		return null;

	}

}
