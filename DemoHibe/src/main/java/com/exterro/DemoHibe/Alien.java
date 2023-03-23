package com.exterro.DemoHibe;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Alien {
	@Id
	private int aid1;
	private String name;
	private String color;
	public int getAid() {
		return aid1;
	}
	public void setAid1(int aid1) {
		this.aid1 = aid1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
