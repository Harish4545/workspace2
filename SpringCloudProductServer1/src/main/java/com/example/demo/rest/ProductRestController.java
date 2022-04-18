package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductRestController {
	
	@Value("${server.port}")
	private String port;
	@GetMapping("/data")
	public ResponseEntity<String> data(){
		return ResponseEntity.ok("product "+port);
	}

}
