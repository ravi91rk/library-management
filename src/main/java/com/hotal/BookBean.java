package com.hotal;

import java.io.Serializable;

public class BookBean implements Serializable{
	private  String bookName,typeOfBook,bookId;
	private int rack;
	public BookBean() {}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getTypeOfBook() {
		return typeOfBook;
	}
	public void setTypeOfBook(String typeOfBook) {
		this.typeOfBook = typeOfBook;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public int getRack() {
		return rack;
	}
	public void setRack(int rack) {
		this.rack = rack;
	}
	
	
	
	

}
