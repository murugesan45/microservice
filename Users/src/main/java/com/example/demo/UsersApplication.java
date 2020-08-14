package com.example.demo;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = { "demo.microservice.controller" })
@EntityScan(basePackages = { "demo.microservice.model" })
@ComponentScan(basePackages = { "demo.microservice.service" })
@EnableJpaRepositories(basePackages = { "demo.microservice.repository" })
@EnableFeignClients(basePackages = { "demo.microservice.service" })
public class UsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersApplication.class, args);
	}
    @Bean	
	public BCryptPasswordEncoder  bCryptPasswordEncoder() {
		
		return new BCryptPasswordEncoder();
	}

}
