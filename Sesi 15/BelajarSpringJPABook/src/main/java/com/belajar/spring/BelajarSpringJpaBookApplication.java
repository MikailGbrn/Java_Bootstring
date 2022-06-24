package com.belajar.spring;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.belajar.spring.entity.BookCategory;
import com.belajar.spring.model.Book;
import com.belajar.spring.repository.BookCategoryRepository;
import com.belajar.spring.repository.BookRespository;

@SpringBootApplication
public class BelajarSpringJpaBookApplication implements CommandLineRunner {
	
	private final Logger LOG = LoggerFactory.getLogger(BelajarSpringJpaBookApplication.class);
	
	@Autowired
	private BookRespository bookRepository;
	
	@Autowired
	private BookCategoryRepository bookCategoryRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringJpaBookApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// create new book category
		BookCategory bookCategory = bookCategoryRepository.save(new
				BookCategory("Programming", new Book("Java 1", "Teten N.", "SIS990"), new
						Book("Java 2", "Teten N.", "SIS991")));
		LOG.info("Book Category " + bookCategory);
	}

}
