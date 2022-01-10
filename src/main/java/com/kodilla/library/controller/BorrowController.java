package com.kodilla.library.controller;

import com.kodilla.library.domain.reader.BorrowDto;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/library/borrow")
public class BorrowController {
    @GetMapping(value = "getBorrows")
    public List<BorrowDto> getBorrows(){
        return new ArrayList<>();
    }

    @GetMapping(value = "getBorrow")
    public BorrowDto getBorow(Long borrowId){
        return new BorrowDto(1L,1L, 1L,
                LocalDate.of(2021, 9,23),
                LocalDate.of(2021, 10, 12));
    }

    @DeleteMapping(value = "deleteBorrow")
    public void deleteBorrow(Long borrowId){

    }

    @PutMapping(value = "updateBorrow")
    public BorrowDto updateBorrow (BorrowDto borrowDto){
        return new BorrowDto(1L, 1L, 2L,
                LocalDate.of(2021, 10, 14),
                LocalDate.of(2021, 11, 12));
    }

    @PostMapping(value = "createBorrow")
    public void createBorrow(BorrowDto borrowDto){

    }
}
