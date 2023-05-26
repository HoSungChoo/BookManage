package com.spring.book.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "libraries")
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long libraryId;
    @Column(nullable = false)
    String libraryName;
    @Column(nullable = false)
    String libraryAddress;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    Date libraryCreateAt;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "libTypeBookId")
    List<LibTypeBook> libTypeBooks = new ArrayList<>();
}
