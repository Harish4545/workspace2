package com.example.demo.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/post")
	public Employee postEmployeeDetails(@RequestBody Employee employee) {
		return service.postEmployeeDetails(employee);
	}
	
	
	@GetMapping("/{id}")
	public Optional<Employee> getData(@PathVariable("id") Integer empid) {
	return service.getData(empid);
}
	
	@DeleteMapping("/remove/{id}")
	public Employee deleteEmployee(@PathVariable Integer id) {
		
			return service.deleteEmployee(id);		
	}
}
