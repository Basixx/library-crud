package com.kodilla.library.domain.reader;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.text.DateFormat;


@Getter
@AllArgsConstructor
public class BorrowDto {
    private Long id;
    private Long copyId;
    private Long readerId;
    private DateFormat borrowDate;
    private DateFormat returnDate;
}
