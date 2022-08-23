package com.aurionpro.model;

public class Shelf {
	Book book;
	DvD dvd;
	
	public void addProduct(Book book) {
		book.seeReviews();
		book.getSample();
	}
	
	 public  void customizeShelf() {
	     System.out.println("your shelf is customized");
	    }
	

}
