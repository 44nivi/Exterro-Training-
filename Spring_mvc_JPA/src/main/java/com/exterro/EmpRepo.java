package com.exterro;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Emp_Data,String>{
    List<Emp_Data> findByemail(String email);

	
}
