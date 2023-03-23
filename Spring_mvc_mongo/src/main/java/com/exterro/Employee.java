package com.exterro;

import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection="nivek")
public class Employee {
	
	 private String Id;

	    private String email;
	    private String pass;
	    private String rpass;
	    

	public Employee(String email, String pass, String rpass) {
			super();
			this.email = email;
			this.pass = pass;
			this.rpass = rpass;
		}


	@Override
		public String toString() {
			return "Employee [Id=" + Id + ", email=" + email + ", pass=" + pass + ", rpass=" + rpass + "]";
		}


	public String getId() {
			return Id;
		}


		public void setId(String id) {
			Id = id;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPass() {
			return pass;
		}


		public void setPass(String pass) {
			this.pass = pass;
		}


		public String getRpass() {
			return rpass;
		}


		public void setRpass(String rpass) {
			this.rpass = rpass;
		}


	

	
}