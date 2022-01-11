package com.kodilla.library.repository;

import com.kodilla.library.domain.reader.Copy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CopyRepository extends CrudRepository<Copy, Long> {
    List<Copy> findAll();
}
