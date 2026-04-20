package com.bridgelabz.order_service.service;

import com.bridgelabz.order_service.entity.Order;
import com.bridgelabz.order_service.repository.OrderRepository;
import com.bridgelabz.order_service.client.BookClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repo;

    @Autowired
    private BookClient bookClient;

    public Order save(Order order) {

        try {
            List<Map<String, Object>> books = bookClient.getBooks();

            System.out.println("Books fetched: " + books);

        } catch (Exception e) {
            e.printStackTrace();   // 🔥 WILL SHOW REAL ERROR
        }

        return repo.save(order);
    }

    public List<Order> getAll() {
        return repo.findAll();
    }
}