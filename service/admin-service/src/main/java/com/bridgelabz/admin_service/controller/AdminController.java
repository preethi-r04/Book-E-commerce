package com.bridgelabz.admin_service.controller;

import com.bridgelabz.admin_service.client.OrderClient;
import com.bridgelabz.admin_service.client.UserClient;
import com.bridgelabz.admin_service.entity.Admin;
import com.bridgelabz.admin_service.service.AdminService;
import com.bridgelabz.admin_service.client.ProductClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService service;
    @Autowired
    private OrderClient orderClient;

    // View all orders
    @GetMapping("/orders")
    public Object getOrders() {
        try {
            Object response = orderClient.getOrders();
            System.out.println("Orders: " + response);  // debug
            return response;
        } catch (Exception e) {
            e.printStackTrace();   // 🔥 VERY IMPORTANT
            return "Error: " + e.getMessage();
        }
    }

    // Update order
    @PutMapping("/orders/{id}")
    public Object updateOrder(@PathVariable Long id, @RequestBody Object order) {
        return orderClient.updateOrder(id, order);
    }

    @Autowired
    private ProductClient productClient;

    // ✅ Create admin
    @PostMapping
    public Admin save(@RequestBody Admin admin) {
        return service.save(admin);
    }

    // ✅ Get all admins
    @GetMapping
    public List<Admin> getAll() {
        return service.getAll();
    }

    // ✅ Update product (Feign call)
    @PutMapping("/products/{id}")
    public Object updateProduct(@PathVariable Long id, @RequestBody Object product) {
        return productClient.updateProduct(id, product);
    }

    // ✅ Delete product (Feign call)
    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productClient.deleteProduct(id);
        return "Deleted successfully";
    }
    @Autowired
    private UserClient userClient;

    // View all users
    @GetMapping("/users")
    public List<Object> getUsers() {
        return userClient.getUsers();
    }
}