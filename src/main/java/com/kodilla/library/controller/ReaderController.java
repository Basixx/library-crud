package com.kodilla.library.controller;

import com.kodilla.library.controller.exception.ReaderNotFoundException;
import com.kodilla.library.domain.Reader;
import com.kodilla.library.domain.ReaderDto;
import com.kodilla.library.mapper.ReaderMapper;
import com.kodilla.library.service.DbServiceReader;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/library")
@RequiredArgsConstructor
public class ReaderController {
    private final DbServiceReader service;
    private final ReaderMapper readerMapper;

    @GetMapping(value = "getReaders")
    public List<ReaderDto> getReaders(){
        List<Reader> readers = service.getAllReaders();
        return readerMapper.mapToReaderDtoList(readers);

    }

    @GetMapping(value = "getReader")
    public ReaderDto getReader(@RequestParam  Long readerId) throws ReaderNotFoundException {
        return readerMapper.mapToReaderDto(
                service.getReader(readerId).orElseThrow(ReaderNotFoundException::new)
        );
    }

    @DeleteMapping(value = "deleteReader")
    public void deleteReader(Long readerId){

    }


    @PostMapping(value = "createReader", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createReader(@RequestBody ReaderDto readerDto){
        Reader reader = readerMapper.mapToReader(readerDto);
        service.saveReader(reader);
    }
}
