package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Organisation {
	

	@Id
	@Column
	@GeneratedValue
	private Long id;
	@Column
	private String name;
	@Column
	private String address;
	public Organisation() {

	}
	
	
	public Organisation(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

//	public List<Department> getDepartments() {
//		return departments;
//	}
//
//	public void setDepartments(List<Department> departments) {
//		this.departments = departments;
//	}
//
//	public List<Employee> getEmployees() {
//		return employees;
//	}
//
//	public void setEmployees(List<Employee> employees) {
//		this.employees = employees;
//	}

//	@Override
//	public String toString() {
//		return "Organization [id=" + id + ", name=" + name + ", address=" + address + "]";
//	}



}
