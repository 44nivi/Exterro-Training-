package com.exterro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class My_Controller {

	  @RequestMapping("/welcome")
	    public void Hello() {
	        System.out.println("Welcome!!!!!!!!!!!!!!Home!!!!");
	        
	    }
}
