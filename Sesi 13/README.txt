--- HIBERNATE ----

Hibernate adalah  framework untuk Java yang melakukan koneksi ke database relasional seperti MySQL, SQLServer, Oracle, DB2, dan lain-lain.

--- Cara Memasang Hibernate ---

1. lakukan penginstallan plugin maven pada IDE
2. buat sebuah project maven
3. Memasukkan dependency hibernate di pom.xml dari project maven tersebut
 <dependency> 
	<groupId>org.hibernate</groupId>
	<artifactId>hibernate</artifactId>
	<version>3.2.6.ga</version>
 </dependency>
 <dependency> 
	<groupId>org.hibernate</groupId>
	<artifactId>hibernate-annotations</artifactId>
	<version>3.3.1.GA</version>
 </dependency>
 <dependency>
	<groupId>mysql</groupId>
	<artifactId>mysql-connector-java</artifactId>
	<version>5.1.9</version>
 </dependency>
4. Setelah itu jalankan project tersebut untuk dapat membuat database dari project