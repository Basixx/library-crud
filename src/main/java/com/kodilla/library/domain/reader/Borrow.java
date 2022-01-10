package com.kodilla.library.domain.reader;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Borrow {
    private Long id;
    private Long copyId;
    private Long readerId;
    private LocalDate borrowDate;
    private LocalDate returnDate;
}
