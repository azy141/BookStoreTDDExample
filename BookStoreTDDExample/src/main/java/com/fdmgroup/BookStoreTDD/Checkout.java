package com.fdmgroup.BookStoreTDD;

import java.util.ArrayList;

public class Checkout {
	static double bookPrice = 25.99;
	ArrayList<Book> listOfBooks = new ArrayList<Book>();

	public static double calculatePrice(Basket basket) {
		
		return 0;
	}

	public static double calculateactualPrice(Basket basket) {
		if (basket.getBooksInBasket() == 3){
			double discountedPrice=bookPrice*0.99;
			double price = discountedPrice*basket.getBooksInBasket(); 
			 
			 return price;
			 }
		else if (basket.getBooksInBasket() == 7){
			double discountedPrice=bookPrice*0.98;
			double price = discountedPrice*basket.getBooksInBasket(); 
			return price;
		}



		else
			if (basket.getBooksInBasket() >9){
		double price = bookPrice*basket.getBooksInBasket()*0.9;
		
		
		int multiple = (basket.getBooksInBasket()/3);
		
		double discount = 1-(multiple*0.01);
		
		price *= discount;
		
			return price;}
		
		else return (bookPrice*basket.getBooksInBasket());
			
		
	}
}



