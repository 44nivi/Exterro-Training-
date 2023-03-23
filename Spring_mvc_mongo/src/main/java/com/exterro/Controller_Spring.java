package com.exterro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller_Spring {

	@Autowired
    EmployeeRepo emprepo;

    @GetMapping("go")

    public ModelAndView showData() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("Register.html");

        return mv;
    }

    @PostMapping("register")
    public ResponseEntity<Employee> insertData(@RequestParam("email") String email, @RequestParam("psw") String pass,
            @RequestParam("psw-repeat") String rpass) {
    	
        Employee emp = new Employee(email, pass, rpass);

        try {

            Employee ee = emprepo.save(new Employee(emp.getEmail(), emp.getPass(), emp.getPass()));
            //emprepo.deleteByEmail(email);
            return new ResponseEntity<>(emp, HttpStatus.CREATED);
        }

        catch (Exception e) {
        	System.out.println(e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
}
