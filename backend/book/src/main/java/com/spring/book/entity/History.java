package com.spring.book.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "histories")
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long historyId;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    Date historyRental;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    Date historyReturn;
}
