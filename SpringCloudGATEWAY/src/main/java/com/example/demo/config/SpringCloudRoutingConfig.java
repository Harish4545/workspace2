package com.example.demo.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudRoutingConfig {

	@Bean
	public RouteLocator config(RouteLocatorBuilder builder) {
		 return builder.routes().route("employeeId",r->r.path("/employee/**").uri("lb://EMPLOYEE-SERVICE"))
		                        .route("productId",r->r.path("/product/**").uri("lb://PRODUCT-SERVICE"))
		                        .build();                    		        
	}
}
