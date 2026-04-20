package com.bridgelabz.book_service.controller;

import com.bridgelabz.book_service.entity.Book;
import com.bridgelabz.book_service.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return service.save(book);
    }

    @GetMapping
    public List<Book> getBooks() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        service.delete(id);
        return "Deleted";
    }
}