package com.kodilla.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.Set;

@Getter
@AllArgsConstructor
public class CopyDto {
    private Long id;
    private Book book;
    private String state;
    private Set<Borrow> borrows;

    public CopyDto(Book book, String state) {
        this.book = book;
        this.state = state;
    }


}
