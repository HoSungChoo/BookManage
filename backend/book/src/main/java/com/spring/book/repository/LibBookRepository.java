package com.spring.book.repository;

import com.spring.book.entity.Book;
import com.spring.book.entity.LibBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibBookRepository extends JpaRepository<LibBook, Long> {
}
