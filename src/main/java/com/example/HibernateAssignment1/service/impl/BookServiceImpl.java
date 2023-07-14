package com.example.HibernateAssignment1.service.impl;

import com.example.HibernateAssignment1.entity.Book;
import com.example.HibernateAssignment1.entity.Customer;
import com.example.HibernateAssignment1.repository.BookRepository;
import com.example.HibernateAssignment1.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public List<Book> getBookBySpecificCustomer(String name) {
        return bookRepository.findAll().stream().filter(book -> book.getCustomer().getCustomerName().equals(name)).collect(Collectors.toList());
    }

    @Override
    public Book addBooks(Book book) {
        return bookRepository.save(book);
    }
}
