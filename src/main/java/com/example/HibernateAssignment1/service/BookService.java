package com.example.HibernateAssignment1.service;

import com.example.HibernateAssignment1.entity.Book;

import java.util.List;

public interface BookService {
    public List<Book> getAllBooks();
    public Book addBooks(Book book);
    //Retrive a book by specific customer
    public List<Book> getBookBySpecificCustomer(String name);
}
