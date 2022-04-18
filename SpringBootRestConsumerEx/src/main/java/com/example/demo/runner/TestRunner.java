package com.example.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

 @Component
public class TestRunner implements CommandLineRunner {

	
	public void run(String... args) throws Exception {

		String url="http://localhost:8080/show";
	//	String url="http://localhost:8080/showempdata";

		
		RestTemplate rt=new RestTemplate();
		
		ResponseEntity<String> res=rt.getForEntity(url, String.class);
		// ResponseEntity<Employee> res=rt.getForEntity(url, Employee.class);

		
		System.out.println(res.getBody());
		System.out.println(res.getHeaders());
		System.out.println(res.getStatusCode().name());
		System.out.println(res.getStatusCodeValue());
	}

}
