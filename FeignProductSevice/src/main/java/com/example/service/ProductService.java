package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> getProductData() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}


	public Product postProductData(Product product) {
		// TODO Auto-generated method stub
		return repository.save(product);
	}
	
}
