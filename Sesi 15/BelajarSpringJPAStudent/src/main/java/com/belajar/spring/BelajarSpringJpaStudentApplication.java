package com.belajar.spring;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.belajar.spring.entity.Course;
import com.belajar.spring.entity.Student;
import com.belajar.spring.repository.CourseRepository;
import com.belajar.spring.repository.StudentRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BelajarSpringJpaStudentApplication implements CommandLineRunner {

private final Logger LOG = LoggerFactory.getLogger(BelajarSpringJpaStudentApplication.class);
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	public static void main(String[] agrs) {
		SpringApplication.run(BelajarSpringJpaStudentApplication.class, agrs);
	}
	
	@Override
	public void run(String...args) throws Exception {
		
		//create student
		Student student = new Student("Bagas", 17);
		
		//save student
		studentRepository.save(student);
		
		
//		create courses
		
		Course course1 = new Course("Belajar Java", 2, 1500);
		Course course2 = new Course("Belajar Springboot", 10, 7500);
		Course course3 = new Course("Final Project", 1, 3500);
		
		courseRepository.saveAll(Arrays.asList(course1, course2, course3));
		
		student.getCourses().addAll(Arrays.asList(course1, course2, course3));
		
		studentRepository.save(student);
		LOG.info("Student :" +student);
		
		
		
	}

}
