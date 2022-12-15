package com.example.demo;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
public class EmployeeController {
	@Autowired
	public EmployeeService service;
	
	@PostMapping("/employee")
	public Employee creatEmployee(@Validated @RequestBody Employee emp) {
		return service.create(emp);
	}
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return service.getAll();
	}
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable String id){
		return service.getById(id);
	}
	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@PathVariable String id,@Validated @RequestBody Employee emp) {
		return service.update(id, emp);
		
	}
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable String id) {
		service.delete(id);
		return "deleted successfully";
	}
}
		
	
	/*
	@PutMapping("/employee/{id}")
	public employee updateEmployee(@PathVariable String id,@Validated @RequestBody Employee emp) {
		
	}*/
	
	
	
