package com.exterro;

import java.util.List;

public interface Service_Admin {


	public void saver(Admin_Regi add);

	public boolean checkCredentials(String name,String password);

	public void adding(Admin_add_on ad);

	public List<Admin_add_on> findAll();

	public List<Admin_add_on> findByGender(String gender);

	public List<Admin_add_on> findByColumnNameContaining(String find); 
}
