package com.fdmgroup.BookStoreTDD;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

public class CatalogueTest {
	@Test
	public void test_GetAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue(){
		ReadItemCommand readItem = mock(ReadItemCommand.class);
		Catalogue mockcattest = new Catalogue(readItem);
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList = mockcattest.getAllBooks();
		assertEquals(0,bookList.size());
		
		
	}
	
	@Test
	public void test_GetAllBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled(){
		ReadItemCommand readItem = mock(ReadItemCommand.class);
		Catalogue mockcattest = new Catalogue(readItem);
		mockcattest.getAllBooks();
		verify(readItem, times(1)).readAll();
	
		}
	
	@Test
	
	public void test_GetAllBooks_ReturnsListOfBooksItReceivesFromReadAllMethodOfReadItemCommand_WhenCalled(){

		
	//Arrange
		ReadItemCommand readItem = mock(ReadItemCommand.class);
		Catalogue mockcattest = new Catalogue(readItem);
		ArrayList<Book> bookList = (ArrayList<Book>)mock(ArrayList.class);
	//Act
		ArrayList<Book> result = mockcattest.getAllBooks();
		bookList = readItem.readAll();
	//Assert

		when(mockcattest.getAllBooks()).thenReturn(bookList); 
		
		assertEquals(bookList,result);
	}
	
	@Test
	public void test_AddBook_CallsInsertItemMethodOfWriteItemCommand_WhenCalled(){
		ReadItemCommand readItem = mock(ReadItemCommand.class);
		Catalogue mockcattest = new Catalogue(readItem);
		
	
	
	}

	
}
