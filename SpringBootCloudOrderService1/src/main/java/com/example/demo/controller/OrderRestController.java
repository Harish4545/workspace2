package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.consumer.ProductConsumer;

@RestController
public class OrderRestController {
	
	@Autowired
	private ProductConsumer consumer;

	@GetMapping("/showData")
	public ResponseEntity<String> Fetch(){
		
		ResponseEntity<String> response=consumer.Display();
		
		return new ResponseEntity<String>("Harish Lucky "+response.getBody(),HttpStatus.OK);
	}
}
