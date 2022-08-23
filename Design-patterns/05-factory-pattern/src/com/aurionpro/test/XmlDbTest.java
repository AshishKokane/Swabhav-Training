package com.aurionpro.test;

import com.aurionpro.model.DaoFactoryProducer;
import com.aurionpro.model.IDao;
import com.aurionpro.model.IDaoAbstractfactory;

public class XmlDbTest {

	public static void main(String[] args) {
		
		IDaoAbstractfactory factory =  DaoFactoryProducer.getInstance().produce("xml");
		IDao dao = factory.createDao("emp");
		dao.save();
		

	}
}
