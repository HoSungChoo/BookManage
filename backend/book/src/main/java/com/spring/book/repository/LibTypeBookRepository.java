package com.spring.book.repository;

import com.spring.book.entity.Book;
import com.spring.book.entity.LibTypeBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibTypeBookRepository  extends JpaRepository<LibTypeBook, Long> {
}
