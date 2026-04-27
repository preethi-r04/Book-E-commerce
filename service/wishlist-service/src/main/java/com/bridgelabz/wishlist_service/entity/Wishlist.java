package com.bridgelabz.wishlist_service.entity;

import jakarta.persistence.*;

@Entity
public class Wishlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;

    public Wishlist() {}

    public Long getId() { return id; }
    public Long getProductId() { return productId; }

    public void setId(Long id) { this.id = id; }
    public void setProductId(Long productId) { this.productId = productId; }
}