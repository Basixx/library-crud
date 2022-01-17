package com.kodilla.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class ReaderDto {
    private Long id;
    private String firstname;
    private String lastname;
    private LocalDate accountCreationDate;

    public ReaderDto (String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        this.accountCreationDate = LocalDate.now();
    }
}
