===== Spring Book ======

membuat pom.xml
---
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
		    <groupId>com.zaxxer</groupId>
		    <artifactId>HikariCP</artifactId>
		    <version>3.1.0</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
			<exclusions>
				<exclusion>
				 	<groupId>org.junit.vintage</groupId>
				 	<artifactId>junit-vintage-engine</artifactId>
				 </exclusion>
			</exclusions>
		</dependency>

	</dependencies>

application properties
----
#MySQL Connection
spring.datasource.url=jdbc:mysql://localhost:3306/db_buku
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

#HikariCP
spring.datasource.hikari.connection-timeout=20000
spring.datasource.hikari.minimum-idle=5
spring.datasource.hikari.maximum-pool-size=12
spring.datasource.hikari.idle-timeout=300000
spring.datasource.hikari.max-lifetime=12000
spring.datasource.hikari.auto-commit=true
	
#JPA Properties
spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect
spring.jpa.hibernate.ddl-auto=update


com.belajar.spring.entity buat file BookCategory.java
-----
package com.belajar.spring.entity;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.belajar.spring.model.Book;

@Entity
public class BookCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@OneToMany (
			mappedBy = "bookCategory",
			cascade = CascadeType.ALL
			)
	private List<Book> books;
	
	public BookCategory() {
		
	}
	
	public BookCategory(String name, Book...books ) {
		this.name = name;
		this.books = Stream.of(books).collect(Collectors.toList());
		this.books.forEach(x -> x.setBookCategory(this));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	@Override
	public String toString() {
		return "Book Category{" +
				"id=" + id + 
				", name=" + name + '\'' +
				", books = " + books +
				'}';
	}
	
}

di dalam com.belajar.spring.model buat file book.java
----
package com.belajar.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.belajar.spring.entity.BookCategory;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String writer;
	
	@Column(nullable = false)
	private String isbn;
	
	@ManyToOne
	@JoinColumn
	
	private BookCategory bookCategory;
	
	public Book() {
		
	}
	
	public Book(String title, String writer, String isbn) {
		this.title = title;
		this.writer = writer;
		this.isbn = isbn;
	}

	public BookCategory getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	@Override
	public String toString() {
		return "Book {" + 
				"id=" + id +
				", title=" + title + '\'' +
				", writer=" + writer + '\'' +
				", isbn=" + isbn + '\'' +
				'}';
	}
	
}


di dalam package repository buat file BookCategoryRepository.java
----
package com.belajar.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.spring.entity.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {
}


dan BookRepository.java
---
package com.belajar.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.belajar.spring.model.Book;

public interface BookRespository extends JpaRepository<Book, Long> {
	
	List<Book> findAll();
	
	List<Book> findAllByWriter(String Writer);
	
	Book findByIsbn(String isbn);
	
	Book findByTitle(String title);
	
	@Query(
			nativeQuery = true,
			value = "select * from book"
			)
	List<Book> findAllQueryNative();
	
	@Query(
			nativeQuery = true,
			value = "select * from book where writer = ?1"
			)
	List<Book> findAllByWriterQueryNative(String Writer);
	
}

======= JPA Student ========

konfigurasi pom.xml sebagai berikut
----
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
		    <groupId>com.zaxxer</groupId>
		    <artifactId>HikariCP</artifactId>
		    <version>3.1.0</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
			<exclusions>
				<exclusion>
				 	<groupId>org.junit.vintage</groupId>
				 	<artifactId>junit-vintage-engine</artifactId>
				 </exclusion>
			</exclusions>
		</dependency>

	</dependencies>

konfigurasi application.properties sebagai berikut
---
#MySQL Connection
spring.datasource.url=jdbc:mysql://localhost:3306/db_student
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

#HikariCP
spring.datasource.hikari.connection-timeout=20000
spring.datasource.hikari.minimum-idle=5
spring.datasource.hikari.maximum-pool-size=12
spring.datasource.hikari.idle-timeout=300000
spring.datasource.hikari.max-lifetime=12000
spring.datasource.hikari.auto-commit=true
	
#JPA Properties
spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect
spring.jpa.hibernate.ddl-auto=update


Cara menjalankannya:
1. BelajarSpringJpaStudentApplication.java adalah file main dimana akan melakuakn eksekusi 
2. Data untuk melakukan eksekusi diambil dari package repository dimana terdapat CourseRepository.java dan StudentRepository.java
3. membuat entity Course.java dan Student.java dimana kedua entity tersebut bersifat one to many

