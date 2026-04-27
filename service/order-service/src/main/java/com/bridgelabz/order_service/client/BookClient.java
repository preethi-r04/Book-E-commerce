package com.bridgelabz.order_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "BOOK-SERVICE")
public interface BookClient {

    @GetMapping("/books")
    Object getBooks();   // 🔥 CHANGED
}