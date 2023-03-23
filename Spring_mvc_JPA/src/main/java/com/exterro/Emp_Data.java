package com.exterro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="Employeeeeeeeee")
public class Emp_Data {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String email;
	private String Password;
	

	public Emp_Data() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}

	public Emp_Data(String email, String password) {
		super();

		this.email = email;
		this.Password = password;
	}

	@Override
	public String toString() {
		return "Emp_Data [Id=" + id + ", email=" + email + ", Password=" + Password + "]";
	}

}
