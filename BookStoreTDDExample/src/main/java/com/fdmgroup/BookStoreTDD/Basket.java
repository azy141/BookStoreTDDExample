package com.fdmgroup.BookStoreTDD;

import java.util.ArrayList;

public class Basket {
	ArrayList<Book> listOfBooks = new ArrayList<Book>();
	
	public int getBooksInBasket() {
		int size = listOfBooks.size();
		return size;
	}

		public void addBook(Book book) {
			listOfBooks.add(book);
			
	}


	
}
