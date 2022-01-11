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
@Entity(name = "reader")
public class Reader {
        @Id
        @GeneratedValue
        private Long id;

        @Column(name = "firstname")
        private String firstname;

        @Column(name = "lastname")
        private String lastname;

        @Column(name = "accountCreationDate")
        private DateFormat accountCreationDate;
}

