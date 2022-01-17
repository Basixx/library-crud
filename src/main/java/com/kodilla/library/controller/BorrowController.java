package com.kodilla.library.controller;

import com.kodilla.library.controller.exception.BorrowNotFoundException;
import com.kodilla.library.domain.Borrow;
import com.kodilla.library.domain.BorrowDto;
import com.kodilla.library.mapper.BorrowMapper;
import com.kodilla.library.service.DbServiceBorrow;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/v1/library")
@RequiredArgsConstructor
public class BorrowController {
    private final DbServiceBorrow service;
    private final BorrowMapper borrowMapper;

    @GetMapping(value = "getBorrows")
    public List<BorrowDto> getAllBorrows(){
        List<Borrow> borrows = service.getAllBorrows();
        return borrowMapper.mapToBorrowDtoList(borrows);
    }

    @GetMapping(value = "getBorrow")
    public BorrowDto getBorrow(@RequestParam Long borrowId) throws BorrowNotFoundException{
        return borrowMapper.mapToBorrowDto(
                service.getBorrow(borrowId).orElseThrow(BorrowNotFoundException::new)
        );
    }

    @DeleteMapping(value = "deleteBorrow")
    public void deleteBorrow(@RequestParam Long borrowId) throws BorrowNotFoundException {
        service.deleteBorrow(borrowId);
        //tu powinnam zmienić status kopii, ale nie wiem jak
    }

    @PutMapping(value = "updateBorrow")
    public BorrowDto updateBorrow (@RequestBody BorrowDto borrowDto){
        Borrow borrow = borrowMapper.mapToBorrow(borrowDto);
        Borrow savedBorrow = service.saveBorrow(borrow);
        return borrowMapper.mapToBorrowDto(savedBorrow);
        //tu też nie mam pomysłu jak zmienić status kopii
    }

    @PostMapping(value = "createBorrow")
    public void createBorrow(BorrowDto borrowDto){
        Borrow borrow = borrowMapper.mapToBorrow(borrowDto);
        service.saveBorrow(borrow);
        borrow.getCopy().setState("borrowed");
    }
}
