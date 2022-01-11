package com.kodilla.library.repository;

import com.kodilla.library.domain.reader.Borrow;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BorrowRepository extends CrudRepository <Borrow, Long> {
    List<Borrow> findAll();
}
