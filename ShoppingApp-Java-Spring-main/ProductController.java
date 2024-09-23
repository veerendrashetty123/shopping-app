package com.Project.Project.controller;


import com.Project.Project.model.Product;
import com.Project.Project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/products")
    public class ProductController {
        @Autowired
        private ProductService productService;

        @GetMapping
        public List<Product> getAllProducts() {
            return productService.findAll();
        }

        @PostMapping
        public ResponseEntity<Product> createProduct(@RequestBody Product product) {
            Product createdProduct = productService.save(product);
            return ResponseEntity.ok(createdProduct);
        }
    }

