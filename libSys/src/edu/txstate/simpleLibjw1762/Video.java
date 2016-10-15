package edu.txstate.simpleLibjw1762;

import java.util.Date;

public class Video extends Document {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9001L;
	Integer copies;
	String publisher;
	String author;
	
	@SuppressWarnings("deprecation")
	public Video(String title, String author, String publisher, String date, String copies){
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publishDate = new Date(date);
		this.copies = new Integer(copies);
	}
	
	public String toString(){
		return title + " by " + author;
	}
	
}