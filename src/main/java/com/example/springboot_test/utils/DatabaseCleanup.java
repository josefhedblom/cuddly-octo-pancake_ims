package com.example.springboot_test.utils;


import com.example.springboot_test.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import jakarta.annotation.PreDestroy;

@Profile("dev")
@Component
public class DatabaseCleanup {

    @Autowired
    private ProductRepository productRepository;

    @PreDestroy
    public void cleanUp() {
        productRepository.deleteAll();
        System.out.println("Database cleaned up: All products deleted");
    }
}
