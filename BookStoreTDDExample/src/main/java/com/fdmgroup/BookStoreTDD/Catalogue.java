package com.fdmgroup.BookStoreTDD;

import java.util.ArrayList;

public class Catalogue implements ReadItemCommand {
	
	private ReadItemCommand readItemCommand;
	ArrayList<Book> bookList = new ArrayList<Book>();
//	public ArrayList<Book> getAllBooks() {
//		
//		return bookList;
//	}

	public ArrayList<Book> getAllBooks() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		readItemCommand.readAll();
		
		return bookList;
	}
	
	public Catalogue(ReadItemCommand readItemCommand) {
		this.readItemCommand = readItemCommand;
	}

	public ArrayList<Book> readAll() {
		return bookList;
		
	}

	public void setReadItemCommand (ReadItemCommand item){
		this.readItemCommand = item;
	}
}
