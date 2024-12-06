package com.example.springboot_test;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    private String SKU;
    private int quantity;

    public Product() {}

    public Product(String SKU, int quantity) {
        this.SKU = SKU;
        this.quantity = quantity;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
