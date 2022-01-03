package com.bookstore.service;

import com.bookstore.model.Book;
import com.bookstore.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class BookService {

    private final BookRepository bookRepository;

    public List<Book>getAllBooks(){
        return bookRepository.findAll();
    }
}
