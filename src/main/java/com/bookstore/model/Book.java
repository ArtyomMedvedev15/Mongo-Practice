package com.bookstore.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Document
public class Book {
    @Id
    private String id;

    @Indexed(unique = true)
    private String nameBook;
    private String authorBook;
    private Boolean existBook;
    private Integer countBook;
    private BigDecimal priceBook;
    private List<String> countrysBook;
    private Genre genreBook;
    private Typograph typographBook;
    private LocalDateTime createBook;

    public Book(
        String nameBook,
        String authorBook,
        Boolean existBook,
        Integer countBook,
        BigDecimal priceBook,
        List<String> countrysBook,
        Genre genreBook,
        Typograph typographBook,
        LocalDateTime createBook
    ) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.existBook = existBook;
        this.countBook = countBook;
        this.priceBook = priceBook;
        this.countrysBook = countrysBook;
        this.genreBook = genreBook;
        this.typographBook = typographBook;
        this.createBook = createBook;
    }
}
