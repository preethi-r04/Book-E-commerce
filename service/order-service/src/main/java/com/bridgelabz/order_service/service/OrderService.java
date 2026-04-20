package com.bridgelabz.order_service.service;

import com.bridgelabz.order_service.entity.Order;
import com.bridgelabz.order_service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repo;

    public Order save(Order order) {
        return repo.save(order);
    }

    public List<Order> getAll() {
        return repo.findAll();
    }
}
