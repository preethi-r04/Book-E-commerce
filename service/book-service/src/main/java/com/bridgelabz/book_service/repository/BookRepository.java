package com.bridgelabz.book_service.repository;

import com.bridgelabz.book_service.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
