package com.kodilla.library.domain.reader;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.text.DateFormat;

@Getter
@AllArgsConstructor
public class ReaderDto {
    private Long id;
    private String firstname;
    private String lastname;
    private DateFormat accountCreationDate;
}
