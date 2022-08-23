package com.aurionpro.model;

public class DaoFactoryProducer {

	private static DaoFactoryProducer instance = null;

	private DaoFactoryProducer() {
	};

	public static DaoFactoryProducer getInstance() {
		if (instance == null)
			instance = new DaoFactoryProducer();

		return instance;
	}

	public IDaoAbstractfactory produce(String str) {

		if (str == "xml")
			return new XmlDaoFactory();

		if (str == "db")
			return new DbDaoFactory();

		return null;

	}

}
