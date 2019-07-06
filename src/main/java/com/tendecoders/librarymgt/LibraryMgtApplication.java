package com.tendecoders.librarymgt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan
@SpringBootApplication
public class LibraryMgtApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryMgtApplication.class, args);
	}

}
