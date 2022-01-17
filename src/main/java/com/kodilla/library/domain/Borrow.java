package com.kodilla.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity(name = "borrow")
public class Borrow {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn (name = "reader_id")
    private Reader reader;

    @Column(name = "borrow_date")
    private LocalDate borrowDate;

    @Column(name = "return_date")
    private LocalDate returnDate;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "copy_id")
    private Copy copy;

    public Borrow(Reader reader, LocalDate borrowDate, LocalDate returnDate, Copy copy) {
        this.reader = reader;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.copy = copy;
    }
}
