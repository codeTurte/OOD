package edu.txstate.simpleLibjw1762;

public class Faculty extends libUser {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9001L;

	public Faculty(String userName, String password){
		super(userName, password);
		userVer = "Faculty";
		//getmenu;
	}
	public Faculty(String userName, String password, String ID){
		this(userName, password);
	}
}
