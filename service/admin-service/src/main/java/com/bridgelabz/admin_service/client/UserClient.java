package com.bridgelabz.admin_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "USER-SERVICE")
public interface UserClient {

    @GetMapping("/users")
    List<Object> getUsers();
}