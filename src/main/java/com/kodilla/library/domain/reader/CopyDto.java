package com.kodilla.library.domain.reader;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CopyDto {
    private Long id;
    private Long titleId;
    private String state;
}
