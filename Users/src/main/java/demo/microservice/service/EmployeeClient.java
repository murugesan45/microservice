package demo.microservice.service;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import demo.microservice.model.Employee;

@FeignClient(name="employee")
public interface EmployeeClient {
	
	@GetMapping("/{id}")
	public Optional<Employee> getEmployees(@PathVariable("id") Long id);

}
