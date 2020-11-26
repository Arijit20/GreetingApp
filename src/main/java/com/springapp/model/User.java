package com.springapp.model;

public class User {
	
	private String fName;
	private String lName;
	
	public User() {
	}
	
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
    
	@Override
	public String toString() {
		String str = (fName != null) ? fName+ " " : "";
		str += (lName != null) ? lName : "";
		return str.trim();
	}
}
