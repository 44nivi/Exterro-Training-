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
public class Controller_Jpa {
	@Autowired
    EmpRepo emprepo;

    @GetMapping("go")
    public ModelAndView showData() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("Springpage.html");

        return mv;
    }

    @PostMapping("register")
    public ResponseEntity<Emp_Data> insertData(@RequestParam("email") String email, @RequestParam("psw") String pass) {
        //Emp_Data emp = new Emp_Data(email, pass);
        
        try {
        	Emp_Data emp = new Emp_Data(email, pass);
            Emp_Data ee = emprepo.save(emp);
            emprepo.deleteById(email);
            return new  ResponseEntity<>(ee,HttpStatus.CREATED);
        }

        catch (Exception e) {
        	System.out.println(e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
}