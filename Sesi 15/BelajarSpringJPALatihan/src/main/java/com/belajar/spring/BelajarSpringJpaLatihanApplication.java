package com.belajar.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.belajar.spring.entity.Address;
import com.belajar.spring.entity.User;
import com.belajar.spring.repository.AddressRepository;
import com.belajar.spring.repository.UserRepository;

@SpringBootApplication
public class BelajarSpringJpaLatihanApplication implements CommandLineRunner {
	
	private final Logger LOG = LoggerFactory.getLogger(BelajarSpringJpaLatihanApplication.class);
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringJpaLatihanApplication.class, args);
	}
	
	@Override
	public void run(String...args) throws Exception {
		// create user
		
		User user = new User("Hadi", "hadi@gmail.com", "1234");
		
		//create address
		
		Address address = new Address("Tangerang", "Indonesia", "Banten", "Jl. Kenangan", "15810");
		
		//add user ke parent entity
		address.setUser(user);
		
		//add address ke child entity
		user.setAddress(address);
		
		addressRepository.save(address);
		
		
		
	}
	
	

}
