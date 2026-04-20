package com.bridgelabz.order_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@FeignClient(name = "book-service", url = "http://localhost:8081")
public interface BookClient {

    @GetMapping("/books")
    List<Map<String, Object>> getBooks();   // ✅ CHANGE THIS
}