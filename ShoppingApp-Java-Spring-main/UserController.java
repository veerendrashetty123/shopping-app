package com.Project.Project.controller;

import com.Project.Project.model.User;
import com.Project.Project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/users")
    public class UserController {
        @Autowired
        private UserService userService;

        @GetMapping
        public List<User> getAllUsers() {
            return userService.findAll();
        }

        @PostMapping
        public ResponseEntity<User> createUser(@RequestBody User user) {
            User createdUser = userService.save(user);
            return ResponseEntity.ok(createdUser);
        }
    }


