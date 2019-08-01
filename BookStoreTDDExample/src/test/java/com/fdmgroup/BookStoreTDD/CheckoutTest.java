package com.fdmgroup.BookStoreTDD;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CheckoutTest {
	private Basket basket;
	
	
	@Before
	public void setup(){
	basket = new Basket();
	}
	
	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket(){
		double price=Checkout.calculatePrice(basket);
		assertEquals(0,price,2);
	}	

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook(){
		Book testbook = new Book();
		testbook.setPrice(1);
		double price = testbook.getPrice();
		double numberOfBooks = basket.getBooksInBasket();
		double actualprice = price*numberOfBooks;
		assertEquals(1,actualprice,2);
	
	
	}
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBooksInBasket_WhenPassedBasketWithTwoBooks(){
		Book testbook = new Book();
		testbook.setPrice(1);
		Book testbook2 = new Book();
		testbook2.setPrice(1);
		double price = testbook.getPrice();
		double price2 = testbook2.getPrice();
		double actualprice = price+price2;
		assertEquals(2,actualprice,2);
	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBooksInBasket_WhenPassedBasketWithThreeBooks(){
		Book testbook = new Book();
		basket.addBook(testbook);
		Book testbook2 = new Book();
		basket.addBook(testbook2);
		Book testbook3 = new Book();
		basket.addBook(testbook3);
		Book testbook4 = new Book();
		basket.addBook(testbook4);
		Book testbook5 = new Book();
		basket.addBook(testbook5);
		Book testbook6 = new Book();
		basket.addBook(testbook6);
		Book testbook7 = new Book();
		basket.addBook(testbook7);
		
		double actualprice = Checkout.calculateactualPrice(basket) ;
		assertEquals(178.29,actualprice,0.01);
	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBooksInBasket_WhenPassedBasketWithTenBooks(){
		Book testbook = new Book();
		basket.addBook(testbook);
		Book testbook2 = new Book();
		basket.addBook(testbook2);
		Book testbook3 = new Book();
		basket.addBook(testbook3);
		Book testbook4 = new Book();
		basket.addBook(testbook4);
		Book testbook5 = new Book();
		basket.addBook(testbook5);
		Book testbook6 = new Book();
		basket.addBook(testbook6);
		Book testbook7 = new Book();
		basket.addBook(testbook7);
		Book testbook8 = new Book();
		basket.addBook(testbook8);
		Book testbook9 = new Book();
		basket.addBook(testbook9);
		Book testbook10 = new Book();
		basket.addBook(testbook10);
		double actualprice = Checkout.calculateactualPrice(basket) ;
		assertEquals(226.89,actualprice,0.01);
	}
	
	
}
