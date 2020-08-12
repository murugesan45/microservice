package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class Employee {
	
	@Id
	@Column
	private Long id;
	@Column
	private Long organizationId;
	@Column
	private Long departmentId;
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private String position;

//	public Employee() {
//
//	}
//	
//	public Employee(Long organizationId, Long departmentId, String name, int age, String position) {
//		this.organizationId = organizationId;
//		this.departmentId = departmentId;
//		this.name = name;
//		this.age = age;
//		this.position = position;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}



}
