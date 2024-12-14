package com.example.springboot_test.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component
public class DatabaseCleanup implements ApplicationListener<ContextClosedEvent> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("Attempting to clean up the database...");
        try {
            entityManager.createNativeQuery("DROP TABLE IF EXISTS products").executeUpdate();
            System.out.println("Database cleaned up: Table 'products' dropped");
        } catch (Exception e) {
            System.err.println("Failed to clean up database: " + e.getMessage());
        }
    }
}
