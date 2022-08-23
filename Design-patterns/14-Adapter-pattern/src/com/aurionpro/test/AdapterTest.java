package com.aurionpro.test;

import java.util.List;

import com.aurionpro.model.Biscuit;
import com.aurionpro.model.Hat;
import com.aurionpro.model.HatAdapter;
import com.aurionpro.model.IItem;
import com.aurionpro.model.Pepsi;
import com.aurionpro.model.ShoppingCart;

public class AdapterTest {
	public static void main(String[] args) {

		Hat hat = new Hat("roundHat", "RedColorStylishRoundhat", 1000, 0.10);
		HatAdapter hatadapter = new HatAdapter(hat);

		Biscuit biscuit = new Biscuit("goodday", 10);
		Pepsi pepsi = new Pepsi("CoCoCola", 20);

		ShoppingCart cart = new ShoppingCart();
		cart.additemToCart(biscuit);
		cart.additemToCart(hatadapter);
		cart.additemToCart(pepsi);
		displayItemsInCart(cart);

		System.out.println("total price : " + cart.getTotalprice());

	}

	private static void displayItemsInCart(ShoppingCart cart) {
		List<IItem> cartList = cart.getItems();

		for (IItem i : cartList) {
			System.out.println("Item Name : " + i.getName());
			System.out.println(" Item price : " + i.getPrice());
			
		}
		System.out.println("___________________________");

	}

}
