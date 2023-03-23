package com.exterro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Reg_Employee {
	@Id
	@GeneratedValue
	private int Empid;
	
	@Column
	String Name;

	String Pass;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	public Reg_Employee(String name, String pass) {
		super();
		Name = name;
		Pass = pass;
	}
	
	

}
