package com.bridgelabz.cart_service.controller;

import com.bridgelabz.cart_service.entity.Cart;
import com.bridgelabz.cart_service.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService service;

    @PostMapping
    public Cart add(@RequestBody Cart cart) {
        return service.addToCart(cart);
    }

    @GetMapping
    public List<Cart> getAll() {
        return service.getCart();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteItem(id);
        return "Item removed";
    }
}