package com.example.springboot_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTestApplication.class, args);
//		ApplicationContext context = SpringApplication.run(SpringbootTestApplication.class, args);

//		ProductRepository repository = context.getBean(ProductRepository.class);
//
//		Product product = new Product("ABC-123", 10);
//		Product product2 = new Product("DEF-123", 5);
//
////		MyEntity entity = new MyEntity();
////		entity.setName("Test Name");
////		entity.setValue(123);
//		repository.save(product); //Wont save again if identical primary keys already exists
//		repository.save(product2);

//		System.out.println("Data added successfully!");
	}

}
