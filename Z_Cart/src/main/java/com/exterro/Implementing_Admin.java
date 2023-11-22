package com.exterro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Implementing_Admin implements Service_Admin {
	
	@Autowired
	private AdminRepo repo;
	
	@Autowired
	private Admin_on_repo repo3;

	
	@Autowired
	private Admin_Repo_Login repo2;
	
	@Override
	public void saver(Admin_Regi add) {
		repo.save(add);
	}
	
	

	@Override
	public boolean checkCredentials(String name, String password) {
		Admin admin = repo.findByNameAndPassword(name, password);
        return admin != null;
	}

	@Override
	public void adding(Admin_add_on ad) {

		repo3.save(ad);
	}

	@Override
	public List<Admin_add_on> findAll() {
        return repo3.findAll();

	}


	@Override
	public List<Admin_add_on> findByGender(String gender) {
		return repo3.findByGender(gender);
	}





	@Override
	public List<Admin_add_on> findByColumnNameContaining(String find) {
		List<Admin_add_on> finded=repo3.findByName(find);
		System.out.println(finded);
		return finded; 
	}


	



	

}
