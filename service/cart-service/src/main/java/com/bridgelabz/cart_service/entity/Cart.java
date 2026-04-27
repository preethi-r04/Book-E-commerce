package com.bridgelabz.cart_service.entity;

import jakarta.persistence.*;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;
    private int quantity;

    public Cart() {}

    public Long getId() { return id; }
    public Long getProductId() { return productId; }
    public int getQuantity() { return quantity; }

    public void setId(Long id) { this.id = id; }
    public void setProductId(Long productId) { this.productId = productId; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}