package com.example.HibernateAssignment1.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    private int bookId;
    private String title;
    private String author;
    private int price;

    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;

}
