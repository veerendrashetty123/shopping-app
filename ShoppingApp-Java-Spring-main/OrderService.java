package com.Project.Project.service;


import com.Project.Project.model.Order;
import com.Project.Project.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class OrderService {
        @Autowired
        private OrderRepository orderRepository;

        public List<Order> findAll() {
            return orderRepository.findAll();
        }

        public Order save(Order order) {
            return orderRepository.save(order);
        }

        // Additional methods for order operations can be added
    }

