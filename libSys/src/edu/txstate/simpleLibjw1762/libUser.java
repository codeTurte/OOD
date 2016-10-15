package edu.txstate.simpleLibjw1762;

import java.util.ArrayList;

public class libUser implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9001L;
	protected String userVer;
	protected String password;
	String userName;
	String id;
	ArrayList<Document> checkedOut;
	
	public libUser(String userName, String password)
	{
		this.userName = userName;
		this.password = password;
		checkedOut = new ArrayList<Document>();
		userVer = "None";		
	}
		
	public libUser(String userName, String password, String userVer, String ID)
	{
		this(userName, password);
		this.id = ID;
		this.userVer = userVer;
	}
	
	public String getUserVer()
	{
		return this.userVer;
	}
	
	public String toString(){
		return userName + " (" + userVer + ")";
	}
	
	//public GetMenu(){
	
	//}
	
}
