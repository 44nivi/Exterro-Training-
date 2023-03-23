package com.exterro;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Keep_Notes")
public class Keep {
	@Id
	private int id;
	
	private String A[];
	

	

	@Override
	public String toString() {
		return "Keep [id=" + id + ", A=" + Arrays.toString(A) + "]";
	}

	public String[] getA() {
		return A;
	}

	public void setA(String A[]) {
		this.A = A;
	}

	public Keep() {
		// TODO Auto-generated constructor stub
	}

	public Keep(String A[]) {
		super();
		this.A = A;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	}
