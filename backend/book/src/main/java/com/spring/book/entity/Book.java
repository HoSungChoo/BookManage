package com.spring.book.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "books")
public class Book{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long bookId;
    @Column(nullable = false)
    String bookCode;
    @Column(nullable = false)
    int bookType;
    @Column(nullable = false)
    String bookTitle;
    @Column(nullable = false)
    String bookAuthor;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "libTypeBookId")
    List<LibTypeBook> libTypeBooks = new ArrayList<>();
}