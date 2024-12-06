package com.example.springboot_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductRepository repository;

    public ProductController(ProductRepository repository) { //Dependency injection
        this.repository = repository;
    }

    @GetMapping("/products")
    public List<Product> retrieveAllProducts() {
        return repository.findAll();
    }

//    @PostMapping("/products/{id}")

}
