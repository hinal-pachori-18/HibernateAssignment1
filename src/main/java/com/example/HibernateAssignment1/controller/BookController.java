package com.example.HibernateAssignment1.controller;

import com.example.HibernateAssignment1.entity.Book;
import com.example.HibernateAssignment1.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> allBooks = bookService.getAllBooks();
        return new ResponseEntity<>(allBooks, HttpStatus.FOUND);
    }

    @GetMapping("/specificCustomer/{name}")
    public ResponseEntity<List<Book>> getBookBySpecificCustomer(@PathVariable String name) {
        List<Book> bookBySpecificAuthor = bookService.getBookBySpecificCustomer(name);
        return new ResponseEntity<>(bookBySpecificAuthor, HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity<Book> addBooks(@RequestBody Book book) {
        Book addbook = bookService.addBooks(book);
        return new ResponseEntity<>(addbook, HttpStatus.CREATED);
    }
}
