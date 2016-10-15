package edu.txstate.simpleLibjw1762;

public class Staff extends libUser {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9001L;

	//Constructor
	public Staff(String userName, String password){
		super(userName, password);
		userVer = "Staff";
	}
	
	public Staff(String userName, String password, String ID){
		this(userName, password);
	}
}