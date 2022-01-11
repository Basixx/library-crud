package com.kodilla.library.domain.reader;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.text.DateFormat;

@NoArgsConstructor
@Getter
@AllArgsConstructor
@Entity(name = "borrow")
public class Borrow {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "copyId")
    private Long copyId;

    @Column(name = "readerId")
    private Long readerId;

    @Column(name = "borrowDate")
    private DateFormat borrowDate;

    @Column(name = "returnDate")
    private DateFormat returnDate;
}
