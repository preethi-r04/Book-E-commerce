package com.bridgelabz.admin_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "BOOK-SERVICE") // your product service name
public interface ProductClient {

    @PutMapping("/books/{id}")
    Object updateProduct(@PathVariable Long id, @RequestBody Object product);

    @DeleteMapping("/books/{id}")
    void deleteProduct(@PathVariable Long id);
}