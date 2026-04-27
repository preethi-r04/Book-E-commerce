package com.bridgelabz.order_service.service;

import com.bridgelabz.order_service.entity.Order;
import com.bridgelabz.order_service.repository.OrderRepository;
import com.bridgelabz.order_service.client.BookClient;
import com.bridgelabz.order_service.dto.BookDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repo;

    @Autowired
    private BookClient bookClient;

    // ✅ Save Order
    public Order save(Order order) {

        try {
            Object books = bookClient.getBooks();   // ✅ FIXED
            System.out.println("Books fetched: " + books);

        } catch (Exception e) {
            System.out.println("Error calling Book Service: " + e.getMessage());
        }

        return repo.save(order);
    }
    // ✅ Get all orders
    public List<Order> getAll() {
        return repo.findAll();
    }
}