package com.bookstore.repository;

import com.bookstore.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface BookRepository extends MongoRepository<Book,String> {

    Optional<Book> findBooksByNameBook(String nameBook);
    int countBookByAuthorBook(String authorName);
}
