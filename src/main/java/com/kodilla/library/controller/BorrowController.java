package com.kodilla.library.controller;

import com.kodilla.library.domain.reader.Borrow;
import com.kodilla.library.domain.reader.BorrowDto;
import com.kodilla.library.mapper.BorrowMapper;
import com.kodilla.library.service.DbService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/library")
@RequiredArgsConstructor
public class BorrowController {
    private final DbService service;
    private final BorrowMapper borrowMapper;

    @GetMapping(value = "getBorrows")
    public List<BorrowDto> getBorrows(){
        List<Borrow> borrows = service.getAllBorrows();
        return borrowMapper.mapToBorrowDtoList(borrows);
    }

    @GetMapping(value = "getBorrow")
    public BorrowDto getBorow(Long borrowId){
        return new BorrowDto(1L,1L, 1L,
                SimpleDateFormat.getDateInstance(),
                SimpleDateFormat.getDateInstance());
    }

    @DeleteMapping(value = "deleteBorrow")
    public void deleteBorrow(Long borrowId){

    }

    @PutMapping(value = "updateBorrow")
    public BorrowDto updateBorrow (BorrowDto borrowDto){
        return new BorrowDto(1L, 1L, 2L,
                SimpleDateFormat.getDateInstance(),
                SimpleDateFormat.getDateInstance());
    }

    @PostMapping(value = "createBorrow")
    public void createBorrow(BorrowDto borrowDto){

    }
}
