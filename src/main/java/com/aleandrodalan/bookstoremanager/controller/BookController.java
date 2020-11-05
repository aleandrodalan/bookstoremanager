package com.aleandrodalan.bookstoremanager.controller;

import com.aleandrodalan.bookstoremanager.dto.MessageResponseDTO;
import com.aleandrodalan.bookstoremanager.entity.Book;
import com.aleandrodalan.bookstoremanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO create(@RequestBody Book book) {
        return service.create(book);
    }
}
