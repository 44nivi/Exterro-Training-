package com.exterro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reg_Employee2 {
@Id
@GeneratedValue
private int sno;

@Column
String name;
String age;
String email;
String phone;
String date;
String pass;
String cpass;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getCpass() {
	return cpass;
}

public void setCpass(String cpass) {
	this.cpass = cpass;
}
public Reg_Employee2(String name, String age, String email, String phone, String date, String pass, String cpass) {
	super();
	this.name = name;
	this.age = age;
	this.email = email;
	this.phone = phone;
	this.date = date;
	this.pass = pass;
	this.cpass = cpass;
}

}
