package com.kodilla.library.domain.reader;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@AllArgsConstructor
@Entity(name = "copy")
public class Copy {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "titleId")
    private Long titleId;

    @Column(name = "state")
    private String state;
}
