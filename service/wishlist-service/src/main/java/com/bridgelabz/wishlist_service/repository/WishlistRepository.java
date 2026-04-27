package com.bridgelabz.wishlist_service.repository;

import com.bridgelabz.wishlist_service.entity.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishlistRepository extends JpaRepository<Wishlist, Long> {
}
