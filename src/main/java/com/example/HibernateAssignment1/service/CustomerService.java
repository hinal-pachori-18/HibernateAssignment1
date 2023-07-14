package com.example.HibernateAssignment1.service;

import com.example.HibernateAssignment1.entity.Book;
import com.example.HibernateAssignment1.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getAllCustomer();
    public Customer addCustomer(Customer customer);
}
