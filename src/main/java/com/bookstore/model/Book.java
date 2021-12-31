package com.bookstore.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
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

    private String nameBook;
    private String authorBook;
    private Boolean existBook;
    private Integer countBook;
    private BigDecimal priceBook;
    private List<String> countrysBook;
    private Genre genreBook;
    private Typograph typographBook;
    private ZonedDateTime createBook;

}
