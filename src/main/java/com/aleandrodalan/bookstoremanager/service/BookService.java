package com.aleandrodalan.bookstoremanager.service;

import com.aleandrodalan.bookstoremanager.dto.MessageResponseDTO;
import com.aleandrodalan.bookstoremanager.entity.Book;
import com.aleandrodalan.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public MessageResponseDTO create(Book book) {
        Book saveBook = repository.save(book);

        return MessageResponseDTO
                .builder()
                .message("Book created with ID " + saveBook.getId())
                .build();
    }
}
