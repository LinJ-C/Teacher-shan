package com.dao;

public class Teacher {
	
	private String tId;
	private String tName;
	private String passwd;
	private int    administrators;
	private String aprt;
	
	public String gettId() {
		return tId;
	}
	public void settId(String tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getAdministrators() {
		return administrators;
	}
	public void setAdministrators(int administrators) {
		this.administrators = administrators;
	}
	public String getAprt() {
		return aprt;
	}
	public void setAprt(String aprt) {
		this.aprt = aprt;
	}
	
	

}
