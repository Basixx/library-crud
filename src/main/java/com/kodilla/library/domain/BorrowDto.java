package com.kodilla.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BorrowDto {
    private Long id;
    private Reader reader;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private Copy copy;
}
