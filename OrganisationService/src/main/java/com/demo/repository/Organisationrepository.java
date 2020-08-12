package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Organisation;

public interface Organisationrepository extends JpaRepository<Organisation, Long>{

}
