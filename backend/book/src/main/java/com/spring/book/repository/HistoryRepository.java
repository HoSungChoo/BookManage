package com.spring.book.repository;

import com.spring.book.entity.Book;
import com.spring.book.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository  extends JpaRepository<History, Long> {
}
