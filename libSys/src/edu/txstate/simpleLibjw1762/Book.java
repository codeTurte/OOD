package edu.txstate.simpleLibjw1762;

import java.util.Date;

public class Book extends Document {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9001L;
	String isbn;
	String author;
	Integer copies;
	
	@SuppressWarnings("deprecation")
	public Book(String title, String publisher, String date, String isbn, String copies, String author)
	{
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publishDate = new Date(date);
		this.copies = new Integer(copies);
		this.isbn = isbn;
	}
	
	public String toString()
	{
		return "\n" + title + " by " + author;
	}
	
	
}