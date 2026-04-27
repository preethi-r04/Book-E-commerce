package com.bridgelabz.cart_service.service;

import com.bridgelabz.cart_service.entity.Cart;
import com.bridgelabz.cart_service.repository.CartRepository;
import com.bridgelabz.cart_service.client.ProductClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository repo;

    @Autowired
    private ProductClient productClient;

    public Cart addToCart(Cart cart) {

        try {
            Object products = productClient.getProducts();
            System.out.println("Products: " + products);
        } catch (Exception e) {
            System.out.println("Error calling product service");
        }

        return repo.save(cart);
    }

    public List<Cart> getCart() {
        return repo.findAll();
    }

    public void deleteItem(Long id) {
        repo.deleteById(id);
    }
}