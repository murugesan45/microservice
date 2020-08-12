 package demo.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.microservice.model.UserRequestModel;

@Repository
public interface Repo extends JpaRepository <UserRequestModel, Long>{
	
	UserRequestModel findByEmail(String email);

}
