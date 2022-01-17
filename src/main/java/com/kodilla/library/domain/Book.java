package com.kodilla.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@AllArgsConstructor
@Entity(name = "book")
public class Book {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "publication_year")
    private Integer publicationYear;

    @OneToMany (targetEntity = Copy.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "book")
    private List<Copy> copies;

    public Book (String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public Book(String title, String author, Integer publicationYear, List<Copy> copies) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.copies = copies;
    }
}
