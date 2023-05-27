package com.spring.book.repository;

import com.spring.book.entity.Book;
import com.spring.book.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository  extends JpaRepository<Library, Long> {
}
