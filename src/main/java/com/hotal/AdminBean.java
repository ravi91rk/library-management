package com.hotal;

import java.io.Serializable;

public class AdminBean  implements Serializable{
	
	private String name,user,email,pword,pin;
	private long phon;
	
	public AdminBean() {}
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPword() {
		return pword;
	}
	public void setPword(String pword) {
		this.pword = pword;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public long getPhon() {
		return phon;
	}
	public void setPhon(long phon) {
		this.phon = phon;
	}
	
	
	

}
