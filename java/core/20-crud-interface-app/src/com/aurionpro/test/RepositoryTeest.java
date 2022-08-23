package com.aurionpro.test;

import com.aurionpro.model.CustomerRepository;
import com.aurionpro.model.IRepository;
import com.aurionpro.model.OrderRepository;
import com.aurionpro.model.ProductRepository;

public class RepositoryTeest {

	public static void main(String[] args) {

		IRepository customer = new CustomerRepository();
		IRepository order = new OrderRepository();

		IRepository product = new ProductRepository();

		repositoryCrud(customer);

		System.out.println("------------------");

		repositoryCrud(order);
		System.out.println("------------------");

		repositoryCrud(product);
	}

	private static void repositoryCrud(IRepository repository) {
		repository.create();
		repository.read();
		repository.update();
		repository.delete();
	}

}
