package com.bridgelabz.wishlist_service.controller;

import com.bridgelabz.wishlist_service.entity.Wishlist;
import com.bridgelabz.wishlist_service.service.WishlistService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wishlist")
public class WishlistController {

    @Autowired
    private WishlistService service;

    @PostMapping
    public Wishlist add(@RequestBody Wishlist wishlist) {
        return service.add(wishlist);
    }

    @GetMapping
    public List<Wishlist> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Removed from wishlist";
    }
}