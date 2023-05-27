package com.spring.book.repository;

import com.spring.book.entity.Book;
import com.spring.book.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
