package com.belajar.spring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belajar.spring.model.User;
import com.belajar.spring.repository.UserRepository;

@RestController
@RequestMapping("/api/manage")
public class ManagementController {
	
	private UserRepository userRepository;
	
    public ManagementController(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    
    @GetMapping("/test1")
    public String test1() {
    	return "API Test 1";
    }
    
    @GetMapping("/test2")
    public String test2() {
    	return "API Test 2 :)";
    }
    
    @GetMapping("")
    public List<User> user(){
    	return this.userRepository.findAll();
    }
}
