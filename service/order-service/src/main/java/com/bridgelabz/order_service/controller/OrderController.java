package com.bridgelabz.order_service.controller;

import com.bridgelabz.order_service.entity.Order;
import com.bridgelabz.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping
    public Order create(@RequestBody Order order) {
        return service.save(order);
    }

    @GetMapping
    public List<Order> getAll() {
        return service.getAll();
    }
}
