package com.bookstore;

import com.bookstore.model.Book;
import com.bookstore.model.Genre;
import com.bookstore.model.Typograph;
import com.bookstore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(BookRepository bookRepository){

		return args -> {Typograph typographBook = new Typograph(
			"Local typo",
			"BY",
			1432
		);

		Book book = new Book(
			"War never changed",
			"Remark",
			true,
			4512,
			BigDecimal.valueOf(312),
			List.of("RU,BY"),
			Genre.DRAMA,
			typographBook,
			LocalDateTime.now()
		);

			bookRepository.insert(book);
		};
	}
}
