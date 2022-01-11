package com.kodilla.library.mapper;

import com.kodilla.library.domain.reader.Reader;
import com.kodilla.library.domain.reader.ReaderDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReaderMapper {

    public Reader mapToReader(final ReaderDto readerDto){
        return new Reader(
                readerDto.getId(),
                readerDto.getFirstname(),
                readerDto.getLastname(),
                readerDto.getAccountCreationDate()
        );
    }

    public ReaderDto mapToReaderDto(final Reader reader){
        return new ReaderDto(
                reader.getId(),
                reader.getFirstname(),
                reader.getLastname(),
                reader.getAccountCreationDate()
        );
    }

    public List<ReaderDto> mapToReaderDtoList(final List<Reader> readerList){
        return readerList.stream()
                .map(this::mapToReaderDto)
                .collect(Collectors.toList());
    }
}
