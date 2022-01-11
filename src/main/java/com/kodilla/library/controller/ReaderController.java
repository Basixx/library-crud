package com.kodilla.library.controller;

import com.kodilla.library.domain.reader.Reader;
import com.kodilla.library.domain.reader.ReaderDto;
import com.kodilla.library.mapper.ReaderMapper;
import com.kodilla.library.service.DbService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/library")
@RequiredArgsConstructor
public class ReaderController {
    private final DbService service;
    private final ReaderMapper readerMapper;

    @GetMapping(value = "getReaders")
    public List<ReaderDto> getReaders(){
        List<Reader> readers = service.getAllReaders();
        return readerMapper.mapToReaderDtoList(readers);

    }

    @GetMapping(value = "getReader")
    public ReaderDto getReader(Long readerId){
        return new ReaderDto(1L, "John", "Smith",
                SimpleDateFormat.getDateInstance());
    }

    @DeleteMapping(value = "deleteReader")
    public void deleteReader(Long readerId){

    }

    @PutMapping(value = "updateReader")
    public ReaderDto updateReader (ReaderDto readerDto){
        return new ReaderDto(1L, "John1", "Smith1",
                SimpleDateFormat.getDateInstance());
    }

    @PostMapping(value = "createReader")
    public void createReader(ReaderDto readerDto){

    }
}
