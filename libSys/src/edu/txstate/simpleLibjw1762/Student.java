package edu.txstate.simpleLibjw1762;

public class Student extends libUser{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9001L;
	
	public Student(String userName, String password){
		super(userName, password);
		userVer = "Student";
		//set Menu;
	}
	public Student(String userName, String password, String ID){
		this(userName, password);
	}
}