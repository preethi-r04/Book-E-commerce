package com.bridgelabz.admin_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@FeignClient(name = "ORDER-SERVICE", url = "http://localhost:8082")
public interface OrderClient {

    @GetMapping("/orders")
    Object getOrders();

    @PutMapping("/orders/{id}")
    Object updateOrder(@PathVariable Long id, @RequestBody Object order);
}