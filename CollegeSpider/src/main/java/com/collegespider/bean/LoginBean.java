package com.collegespider.bean;

public class LoginBean {

	String emailId;
	
	String password;
	
	public String getEmailId() {
		return emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginBean [emailId=" + emailId + ", password=" + password + "]";
	}
	
	
	
}
