package com.example.demo.consumer;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;

public class consumer {
	
	private LoadBalancerClient client;
	
	public String getDataFromProduct() {
		
		ServiceInstance si=client.choose("product-service");
		return null;
	}

}
