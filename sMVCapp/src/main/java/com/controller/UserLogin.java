package com.controller;

public class UserLogin {
	private String userName="Titas";
	private String userPassword;
	public UserLogin() {
		//System.out.println("Constructor . . .");
	}
	public String getUserName() {
		//.out.println("Getter of uname . . .");
		return userName;
	}
	public void setUserName(String userName) {
		//System.out.println("Setter of uname . . .");
		this.userName = userName;
	}
	public String getUserPassword() {
		//System.out.println("Getter of upass . . .");
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		//System.out.println("Setter of upass . . .");
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "UserLogin [userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	
}
