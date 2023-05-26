package com.spring.book.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "lib_type_books")
public class LibTypeBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long libTypeBookId;
    @Column(nullable = false)
    long libTypeBookStock;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "libBookId")
    List<LibBook> libBooks;
}
