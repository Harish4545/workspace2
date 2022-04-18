package com.example.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class PostRTestRunner implements CommandLineRunner {

	
	public void run(String... args) throws Exception {
		
          String url="http://localhost:8080/save";
		
		RestTemplate rt=new RestTemplate();
		
		HttpHeaders headers=new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		String body="{\"eid\":1,\"ename\":\"Harish\",\"esal\":25000.00}";
		
		HttpEntity<String> requestEntity=new HttpEntity<String>(body,headers);
		
		ResponseEntity<String> res=rt.postForEntity(url,requestEntity,String.class);
		
		System.out.println(res.getBody());
		System.out.println(res.getHeaders());
		System.out.println(res.getStatusCode().name());
		System.out.println(res.getStatusCodeValue());
	}

	

}
