package com.aurionpro.test;



import com.aurionpro.model.Book;
import com.aurionpro.model.Shelf;

public class User {

	public static void main(String[] args) {
		Shelf sh = new Shelf();
		Book book = new Book();
		sh.addProduct(book);


	}

}
