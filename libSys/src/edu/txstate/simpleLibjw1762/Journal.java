package edu.txstate.simpleLibjw1762;

import java.util.Date;

public class Journal extends Document {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9001L;
	String isbn;
	Integer copies;
	String author;
	
	@SuppressWarnings("deprecation")
	public Journal(String title, String author, String publisher, String copies, String isbn, String date)
	{
		this.author = author;
		this.title = title;
		this.copies = new Integer(copies);
		this.publisher = publisher;
		this.publishDate = new Date(date);
		
    }
	
	public String toSting()
	{
		return title + "by " + author + "(" + copies + " left)";
	}
}