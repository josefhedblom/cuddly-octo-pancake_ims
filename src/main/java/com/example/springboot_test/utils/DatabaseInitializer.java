package com.example.springboot_test.utils;

import com.example.springboot_test.product.ProductRepository;
import java.util.stream.IntStream;

import com.example.springboot_test.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component
public class DatabaseInitializer implements CommandLineRunner {

    @Autowired
    private final ProductRepository productRepository;

    public DatabaseInitializer(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        IntStream.rangeClosed(1,100).forEach(i -> {
            Product product = new Product();
            product.setName("Product " + i);
            product.setDescription("Product Description " + i);
            product.setPrice(100.0 + i);
            product.setSku(generateSku(i));
            product.setQuantity((int)(Math.random() * 100) + 10);
            product.setShelf(generateShelf(i));
            productRepository.save(product);
        });
        System.out.println("Database initialized with 100 products");
    }

    private String generateSku(int i){
        return "SKU" + String.format("-%04d", i);
    }
    private String generateShelf(int i){return "Hylla" + String.format("-%04d", i);}

}
