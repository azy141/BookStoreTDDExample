package com.fdmgroup.BookStoreTDD;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BasketTest {
	private Basket basket;
	
	
	@Before
	public void setup(){
	basket = new Basket();
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded() {

		int size = basket.getBooksInBasket();
		assertEquals(0, size);
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook() {
		Book testbook = new Book();
		basket.addBook(testbook);
		int basketsize = basket.getBooksInBasket();
		assertEquals(1, basketsize);

	}
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledWithTwoBooks() {
		Book testbook = new Book();
		Book secondbook = new Book();
		basket.addBook(testbook);
		basket.addBook(secondbook);
		int basketsize = basket.getBooksInBasket();
		assertEquals(2, basketsize);

	}
}
