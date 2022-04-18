package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public Employee postEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		return repository.save(employee);
	}

	public Optional<Employee> getData(Integer empid) {
		// TODO Auto-generated method stub 
		return repository.findById(empid);
	}

	public Employee deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
	  return null;
	}

	private Employee getOneEmployee(Integer id) {
		Optional<Employee> opt = repository.findById(id);
		
			return opt.get();
		
	}
}
