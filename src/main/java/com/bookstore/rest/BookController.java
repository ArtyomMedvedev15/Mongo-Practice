package com.bookstore.rest;

import com.bookstore.model.Book;
import com.bookstore.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/all")
    public List<Book>getAllBooks(){
        return bookService.getAllBooks();
    }

}
