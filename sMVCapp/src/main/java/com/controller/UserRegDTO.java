package com.controller;

// DTO : Data Transfer Object
public class UserRegDTO {
	private String name;
	private String userName;
	private String password;
	private String countery;
	private String gender;
	private String msgReg;
	
	public UserRegDTO() {}
	public UserRegDTO(String msgReg) {
		this.msgReg = msgReg;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountery() {
		return countery;
	}
	public void setCountery(String countery) {
		this.countery = countery;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMsgReg() {
		return msgReg;
	}
	public void setMsgReg(String msgReg) {
		this.msgReg = msgReg;
	}
	@Override
	public String toString() {
		return "UserRegDTO [name=" + name + ", userName=" + userName + ", password=" + password + ", countery="
				+ countery + ", gender=" + gender + ", msgReg=" + msgReg + "]";
	}
	


}
