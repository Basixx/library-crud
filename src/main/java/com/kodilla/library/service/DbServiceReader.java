package com.kodilla.library.service;

import com.kodilla.library.domain.Reader;
import com.kodilla.library.repository.ReaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DbServiceReader {
    private final ReaderRepository readerRepository;
    public List<Reader> getAllReaders() {return readerRepository.findAll();}

    public Optional<Reader> getReader(final Long readerId){
        return readerRepository.findById(readerId);
    }

    public Reader saveReader (final Reader reader){return readerRepository.save(reader);}
}
