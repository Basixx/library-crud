package com.kodilla.library.domain.reader;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Copy {
    private Long id;
    private Long titleId;
    private String state;
}
