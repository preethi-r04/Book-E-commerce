package com.bridgelabz.cart_service.repository;

import com.bridgelabz.cart_service.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
