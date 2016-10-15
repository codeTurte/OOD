package edu.txstate.simpleLibjw1762;

import java.util.Date;

public class Loan implements java.io.Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 9001L;
	Document document;
	libUser user;
	Date startDate;
	
	//Constructor
	public Loan(libUser user, Document document)
	{
		this.user = user;
		this.document = document;
		startDate = new Date();
	}
	
	@SuppressWarnings("deprecation")
	public String toString()
	{
		return String.format("%s checked out on %s/%s checked out by: %s", document,startDate.getMonth(),startDate.getDate(),user);
	}
	
}