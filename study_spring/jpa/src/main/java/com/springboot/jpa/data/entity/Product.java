package com.springboot.jpa.data.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    @Column(nullable = false)
    private String name;

    @Column
    private Integer price;

    @Column
    private Integer stock;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
