package com.aurionpro.test;

import com.aurionpro.model.Customer;
import com.aurionpro.model.LineItem;
import com.aurionpro.model.Order;
import com.aurionpro.model.Product;

public class CustomerOrderTest {
	
	
	public static void main(String[] args) {
		
		
		Product product1 = new Product(101, "choclate", 70, 10);
		Product product2 = new Product(102, "chips", 100, 5);
		
		LineItem line1 = new LineItem(1, 2, product1);
		LineItem line2 = new LineItem(2, 4, product2);
		
		
		
		
		Order order1 = new Order(01, "11/8/22");
		order1.addLineItem(line1);
		order1.addLineItem(line2);
		
		
	
		
		System.out.println("Order class order count : "+order1.itemsCount());
		
		
		System.out.println(order1.calculateOrderprice());

		
		Customer customer1 = new Customer(111, "abc");
		
		customer1.addOrder(order1);
		System.out.println("Customer Class order count : " + customer1.getOrderCount());
		
	System.out.println("--------------------same customer adding 2nd order-----------------------");	
	
	Order order2 = new Order(02, "11/8/22");
	order2.addLineItem(line1);
	order2.addLineItem(line2);
	
	
	customer1.addOrder(order2);
	
	System.out.println("Customer Class order count : " + customer1.getOrderCount());
	order2.calculateOrderprice();
	
	System.out.println(order1);
	System.out.println(order2);
//	System.out.println(customer1);
	
	System.out.println("Total price : " + order2.calculateOrderprice());
	
	
	
	
	
	}


	
	
	
}
