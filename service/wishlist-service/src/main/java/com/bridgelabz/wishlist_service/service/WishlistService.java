package com.bridgelabz.wishlist_service.service;

import com.bridgelabz.wishlist_service.entity.Wishlist;
import com.bridgelabz.wishlist_service.repository.WishlistRepository;
import com.bridgelabz.wishlist_service.client.ProductClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishlistService {

    @Autowired
    private WishlistRepository repo;

    @Autowired
    private ProductClient productClient;

    public Wishlist add(Wishlist wishlist) {

        try {
            Object products = productClient.getProducts();
            System.out.println("Products: " + products);
        } catch (Exception e) {
            System.out.println("Error calling product service");
        }

        return repo.save(wishlist);
    }

    public List<Wishlist> getAll() {
        return repo.findAll();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}