package com.example.HibernateAssignment1.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    private int customerId;
    private String customerName;
    private Long phoneNumber;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Book> books;

}
