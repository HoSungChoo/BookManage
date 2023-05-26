package com.spring.book.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long userId;
    @Column(nullable = false)
    String userName;
    @Column(nullable = false)
    int userAge;
    @Column(nullable = false)
    String userGender;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "historyId")
    List<History> histories;
}
