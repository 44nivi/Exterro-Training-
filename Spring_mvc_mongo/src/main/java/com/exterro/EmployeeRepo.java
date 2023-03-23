package com.exterro;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo extends MongoRepository<Employee, String> {
	    
	    List<Employee> findByemail(String email);
	    //void deleteByEmail(String e);
		void deleteByEmail(String e);
	
}
