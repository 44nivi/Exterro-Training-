package com.exterro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringMvcMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcMongoApplication.class, args);
	}

}
