package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Organisation;
import com.demo.repository.Organisationrepository;

@RestController
public class OrganisationController {
	@Autowired(required=true)
	Organisationrepository repository;
	
	@PostMapping
	public Organisation add(@RequestBody Organisation organisation) {
	
		//return repository.add(organisation);
		return repository.save(organisation);
	}
	
	@GetMapping
	public List<Organisation> findAll() {
		
		//return repository.findAll();
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Organisation> findById(@PathVariable("id") Long id) {

		//return repository.findById(id);
		return repository.findById(id);
		
	}

//	@GetMapping("/{id}/with-departments")
//	public Organisation findByIdWithDepartments(@PathVariable("id") Long id) {
//		
//		Organisation organisation = repository.findById(id);
//		organisation.setDepartments(departmentClient.findByOrganisation(organisation.getId()));
//		return organisation;
//	}
//	
//	@GetMapping("/{id}/with-departments-and-employees")
//	public Organisation findByIdWithDepartmentsAndEmployees(@PathVariable("id") Long id) {
//		Organisation organisation = repository.findById(id);
//		organisation.setDepartments(departmentClient.findByOrganisationWithEmployees(organisation.getId()));
//		return organisation;
//	}
//	
//	@GetMapping("/{id}/with-employees")
//	public Organisation findByIdWithEmployees(@PathVariable("id") Long id) {
//	    Organisation organization = repository.findById(id);
//		organization.setEmployees(employeeClient.findByOrganization(organization.getId()));
//		return organization;
//	}

}
