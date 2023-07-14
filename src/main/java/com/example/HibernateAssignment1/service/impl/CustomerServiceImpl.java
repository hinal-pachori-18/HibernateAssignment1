package com.example.HibernateAssignment1.service.impl;

import com.example.HibernateAssignment1.entity.Customer;
import com.example.HibernateAssignment1.repository.CustomerRepository;
import com.example.HibernateAssignment1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
