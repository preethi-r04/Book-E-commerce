package com.bridgelabz.cart_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "BOOK-SERVICE", url = "http://localhost:8081")
public interface ProductClient {

    @GetMapping("/books")
    Object getProducts();
}