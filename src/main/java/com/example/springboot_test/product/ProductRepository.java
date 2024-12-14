package com.example.springboot_test.product;

import com.example.springboot_test.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Long> {

    Optional<Product> findBySku(String sku);
}
