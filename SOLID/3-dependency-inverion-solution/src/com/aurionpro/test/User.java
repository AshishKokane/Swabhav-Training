package com.aurionpro.test;

import com.aurionpro.model.Book;
import com.aurionpro.model.DvD;
import com.aurionpro.model.IProduct;
import com.aurionpro.model.Shelf;

public class User {

	public static void main(String[] args) {

		Shelf sh = new Shelf();
		IProduct book = new Book();
		IProduct dvd = new DvD();
		
		sh.addProduct(book);
		sh.addProduct(dvd);
		
		
		
		

	}

}
