package com.Project.Project.service;


import com.Project.Project.model.Product;
import com.Project.Project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class ProductService {
        @Autowired
        private ProductRepository productRepository;

        public List<Product> findAll() {
            return productRepository.findAll();
        }

        public Product save(Product product) {
            return productRepository.save(product);
        }

        // Additional methods for product operations can be added
    }

