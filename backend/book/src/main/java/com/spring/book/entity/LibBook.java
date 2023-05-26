package com.spring.book.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "lib_books")
public class LibBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long libBookId;
    @Column(nullable = false)
    int libBookDamage;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "historyId")
    List<History> histories;

}
