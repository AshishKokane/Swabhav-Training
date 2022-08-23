package com.aurionpro.model;

public class XmlDaoFactory implements IDaoAbstractfactory {

	@Override
	public IDao createDao(String str) {

		if (str == "emp")
			return new XmlEmpDao();

		if (str == "dept")
			return new XmlDeptDao();

		return null;
	}

}
