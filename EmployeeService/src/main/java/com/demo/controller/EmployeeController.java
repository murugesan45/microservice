package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository repo;
	
	@PostMapping("/")
	public Employee add(@RequestBody Employee employee) {
		  return repo.save(employee);
	}
	
	@GetMapping("/{id}")
	public Optional<Employee> findById(@PathVariable("id") Long id) {
		return repo.findById(id);
	}
	
	@GetMapping("/")
	public List<Employee> findAll() {
		return repo.findAll();
	}
	
//	@GetMapping("/department/{departmentId}")
//	public List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId) {
//		return repo.findByDepartment(departmentId);
//	}
//	
//	@GetMapping("/organization/{organizationId}")
//	public List<Employee> findByOrganization(@PathVariable("organizationId") Long organizationId) {
//		return repo.findByOrganization(organizationId);
//	}



}
