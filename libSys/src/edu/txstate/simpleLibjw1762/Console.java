package edu.txstate.simpleLibjw1762;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public abstract class Console 
{
	static LibrarySys libSys;
	static Scanner scan = new Scanner(System.in);
	String title;
	
	public void showMenu(){
		showMenu(title, options);
	}
	
	public static void mainMenu()
	{
	
	System.out.println("Welcome to the Object-Oriented Simple Library System.");
	System.out.println("========================================================");
	System.out.println("AKA OOSLS.");
	System.out.println("========================================================");
	System.out.println("[1] Login");
	System.out.println("[2] Register");
	System.out.println("[3] Exit");
	
	Scanner scanner = new Scanner(System.in);
	int menuChoice = scanner.nextInt();
	
	String userName = null, password = null;
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	
	switch(menuChoice)
	{
	case 1:		
		System.out.println("Please enter username: ");
		try {
			userName = buffer.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Please enter password: ");	
		try {
			password = buffer.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		libSys.login(userName, password);
		//System.out.println(current);
		//System.out.println(current.getUserVer());
		//showAppropriate Menu
		//studentMenu();
		break;
	case 2:
		System.out.println("Please enter desired username: ");
		try {
			userName = buffer.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Please enter desired password: ");
		try {
			password = buffer.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		libUser newUser = new libUser(userName, password);
		libSys.addUser(newUser);
		libSys.login(userName, password);
		//System.out.println(current);
		break;
	case 3:
		System.out.println("Exiting program...");
		System.exit(0);
		break;
	default:
		System.out.println("Invalid choice.");
		return;
	}
	
	scanner.close();
	
	}
	
	public void studentMenu() 
	{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int choice = 0;
		System.out.println("====Student Menu====");
		System.out.println("[1] Search Documents");
		System.out.println("[2] Reserve Document");
		System.out.println("[3] View Your Checked-Out Items");
		System.out.println("[4] Go Back");
		System.out.println("[5] Logout");
		try {
			buffer.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		switch(choice)
		{
		case 1:
			//reqSearch();
			break;
		case 2:
			//Book b1 = new Book("No Hope in Sight", "Number", "5/21/2010", "Somehwere", "55", "Mr. Nihilist");
			//reqSearch();
			//buffer.readLine();
			//libSys.loanItem(current, b1);
			break;
		case 3:
			libSys.getLoanedItems();
			break;
		case 4:
			//libSys.setMenu();
		case 5:
			libSys.logout();
			break;
		}
		try {
			buffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void staffMenu()
	{
		int choice = 0;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("=====Library Staff Menu=====");
		System.out.println("[1] Add Users");
		System.out.println("[2] Add Documents");
		System.out.println("[3] List Users");
		System.out.println("[4] List Documents");
		System.out.println("[5] List all On-Loan Documents");
		System.out.println("[6] Go Back");
		System.out.println("[7] Logout");
		switch(choice)
		{
		case 1:
			String password = null, username = null;
			System.out.println("Please enter username to add: ");
			try {
				username = buffer.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Please enter password to add: ");
			try {
				password = buffer.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			libUser newUser = new libUser(username, password);
			libSys.addUser(newUser);
			break;
		case 2:
			int addChoice = 0;
			String title, publisher, date, isbn, copies, author;
			
			System.out.println("Please enter title: ");
			try {
				title = buffer.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Please enter publisher: ");
			try {
				publisher = buffer.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Please enter date of publication: ");
			try {
				date = buffer.readLine();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Please enter isbn: ");
			try {
				isbn = buffer.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Please enter number of copies: ");
			try {
				copies = buffer.readLine();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Please enter author: ");
			try {
				author = buffer.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("What type of document is this?");
			System.out.println("[1] Book");
			System.out.println("[2] Journal");
			System.out.println("[3] Video");
			System.out.println("[4] Conference");
			try {
				addChoice = buffer.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			switch(addChoice)
			{
			case 1:				
				Book b = new Book(title, publisher, date, isbn, copies, author);
				libSys.addBook(b);
				break;
			case 2: 
				Journal j = new Journal(title, publisher, date, isbn, copies, author);
				libSys.addJournal(j);
				break;
			case 3:
				Video v = new Video(title, author, publisher, date, copies);
				libSys.addVideo(v);
				break;			
			case 4:			
				Conference c = new Conference(title, publisher, date, isbn, copies, author);
				libSys.addConference(c);
				break;
			}
		
		case 3:
			System.out.println(libSys.getUsers());
		case 4:
			System.out.println(libSys.getBooks());
			System.out.println(libSys.getVideos());
			System.out.println(libSys.getJournals());
			System.out.println(libSys.getConference());
		case 5:
			System.out.println(libSys.getLoans());
		case 6:
			//libSys.setMenu();
			break;
		case 7:
			libSys.logout();
			break;
		}
		

	}
	
	public void facultyMenu()
	{
		
	}
	 
	
}

