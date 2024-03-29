package demo.microservice.service;

import java.util.ArrayList;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import demo.microservice.inter.UsersService;
import demo.microservice.model.Employee;
import demo.microservice.model.UserRequestModel;
import demo.microservice.repository.Repo;

@Service
public class UserService implements UsersService {
	
	@Autowired
	private Repo repo;
	@Autowired
	private BCryptPasswordEncoder  bCryptPasswordEncoder;
    @Autowired
    private EmployeeClient client;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void userService(BCryptPasswordEncoder  bCryptPasswordEncoder ) {
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}
	
	public void post(UserRequestModel user) {
		
	
		
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        
        user.setUserId("kjkajgdwfku");
		repo.save(user);
		
		
		
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		UserRequestModel user = repo.findByEmail(username);
		if(user == null) throw new UsernameNotFoundException(username);
		return new User(user.getEmail(), user.getPassword(), true, true, true, true, new ArrayList<>());
	}

	public  UserRequestModel  getUserDetailsByEmail(String userName) {
		UserRequestModel user = repo.findByEmail(userName);
		if(user == null) throw new UsernameNotFoundException(userName);
		return user;
	}
	
	
	public Optional<Employee> getEmployees(long id) {
		
		logger.info("feign client method ");
		return client.getEmployees(id);
		
	}

}
