package com.exterro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class LoginPage {
	
	
	@Id
	@GeneratedValue
	private int Emp;
	
	@Column
	private String username;
	private String password;
	

	public LoginPage(String username, String password) {
		super();
		this.username = username;
		this.password = password;// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
