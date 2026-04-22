package com.bridgelabz.user_service.repository;

import com.bridgelabz.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}