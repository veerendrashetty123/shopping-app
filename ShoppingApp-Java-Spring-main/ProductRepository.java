package com.Project.Project.repository;


import com.Project.Project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface ProductRepository extends JpaRepository<Product, Long> {}

