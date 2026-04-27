package com.bridgelabz.admin_service.repository;

import com.bridgelabz.admin_service.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}