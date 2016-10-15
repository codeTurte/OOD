package edu.txstate.simpleLibjw1762;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class Search {
	
	protected static LibrarySys lib;
	protected String search;
	
	protected void reqSearch()
	{
		try{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter Searchword: ");	
		search = reader.readLine();
		}
		catch(Exception err)
		{
			System.out.println(err);
		}
		
		
	}
	
	protected void doSearch(){
		for (String search : books)
		{
			
		}
	}
	
}