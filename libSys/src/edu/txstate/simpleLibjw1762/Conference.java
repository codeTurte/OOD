package edu.txstate.simpleLibjw1762;

import java.util.Date;

public class Conference extends Document {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9001L;
	String volume;
	String issue;
	String articles;
	

	
	@SuppressWarnings("deprecation")
	public Conference(String title, String pubDate, String vol, String iss, String publisher, String articles)
	{
		this.issue = iss;
		this.articles = articles;
		this.volume = vol;
		this.title = title;
		this.publishDate = new Date(pubDate);
		this.publisher = publisher;
	}
	
	public String toString(){
		return title + " by " + publisher;
	}
}