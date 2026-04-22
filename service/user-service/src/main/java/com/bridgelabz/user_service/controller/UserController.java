package com.bridgelabz.user_service.controller;

import com.bridgelabz.user_service.entity.User;
import com.bridgelabz.user_service.service.UserService;
import com.bridgelabz.user_service.service.JwtService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @Autowired
    private JwtService jwtService;   // 🔥 ADD THIS

    // ✅ Register User
    @PostMapping
    public User save(@RequestBody User user) {
        return service.save(user);
    }

    // ✅ Get All Users
    @GetMapping
    public List<User> getAll() {
        return service.getAll();
    }

    // 🔐 LOGIN API (JWT)
    @PostMapping("/login")
    public String login(@RequestBody User user) {

        // basic validation
        if (user.getEmail() == null || user.getPassword() == null) {
            return "Invalid credentials";
        }

        // 🔥 Generate JWT token
        return jwtService.generateToken(user.getEmail());
    }
}