package com.kodilla.library.service;

import com.kodilla.library.domain.Borrow;
import com.kodilla.library.domain.BorrowDto;
import com.kodilla.library.repository.BorrowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DbServiceBorrow {
    private final BorrowRepository borrowRepository;

    public List<Borrow> getAllBorrows() {
        return borrowRepository.findAll();
    }

    public Optional<Borrow> getBorrow (final Long borrowId){
        return borrowRepository.findById(borrowId);
    }

    public Borrow saveBorrow(final Borrow borrow){
        return borrowRepository.save(borrow);
    }

    public void deleteBorrow(final Long id){
        borrowRepository.deleteById(id);
    }
}
