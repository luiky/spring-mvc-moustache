package com.mdai.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootWebMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebMvcApplication.class, args);
	}

}
