package com.example.demo.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("product-service")
public interface ProductConsumer {
	
	@GetMapping("/show")
	public ResponseEntity<String> Display();

}
