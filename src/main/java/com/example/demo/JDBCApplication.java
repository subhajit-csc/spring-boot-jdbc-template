package com.example.demo;

import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JDBCApplication implements CommandLineRunner {
	@Autowired
	ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(JDBCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//TO DO: Trigger the Service

		productService.fetcchItemDetails();
	}
}
