package demo.microservice.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import demo.microservice.model.Employee;
import demo.microservice.model.UserRequestModel;
import demo.microservice.service.UserService;

@RestController
public class Controller {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public String status() {
		return "working";
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping("/register")
	public ResponseEntity createUser(@Valid @RequestBody UserRequestModel userDetails) {
	   userService.post(userDetails);
	   return new ResponseEntity(HttpStatus.CREATED);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Employee>> getEmployee(@PathVariable("id") long id){
		return ResponseEntity.status(HttpStatus.OK).body(userService.getEmployees(id));
	}


}
