package com.bridgelabz.admin_service.service;

import com.bridgelabz.admin_service.entity.Admin;
import com.bridgelabz.admin_service.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository repo;

    public Admin save(Admin admin) {
        return repo.save(admin);
    }

    public List<Admin> getAll() {
        return repo.findAll();
    }
}
