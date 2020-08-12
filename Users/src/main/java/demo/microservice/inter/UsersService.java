package demo.microservice.inter;

import org.springframework.security.core.userdetails.UserDetailsService;

import demo.microservice.model.UserRequestModel;

public interface UsersService extends UserDetailsService{

	UserRequestModel getUserDetailsByEmail(String userName);

}
