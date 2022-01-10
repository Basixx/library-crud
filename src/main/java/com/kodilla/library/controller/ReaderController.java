package com.kodilla.library.controller;

import com.kodilla.library.domain.reader.ReaderDto;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/library/reader")
public class ReaderController {
    @GetMapping(value = "getReaders")
    public List<ReaderDto> getReaders(){
        return new ArrayList<>();
    }

    @GetMapping(value = "getReader")
    public ReaderDto getReader(Long readerId){
        return new ReaderDto(1L, "John", "Smith",
                LocalDate.of(2017, 07, 23));
    }

    @DeleteMapping(value = "deleteReader")
    public void deleteReader(Long readerId){

    }

    @PutMapping(value = "updateReader")
    public ReaderDto updateReader (ReaderDto readerDto){
        return new ReaderDto(1L, "John1", "Smith1",
                LocalDate.of(2017, 07, 24));
    }

    @PostMapping(value = "createReader")
    public void createReader(ReaderDto readerDto){

    }
}
