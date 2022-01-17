package com.kodilla.library.mapper;

import com.kodilla.library.domain.Reader;
import com.kodilla.library.domain.ReaderDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReaderMapper {

    public Reader mapToReader(final ReaderDto readerDto){
        return new Reader(
                readerDto.getFirstname(),
                readerDto.getLastname()
        );
    }

    public ReaderDto mapToReaderDto(final Reader reader){
        return new ReaderDto(
                reader.getFirstname(),
                reader.getLastname()
        );
    }

    public List<ReaderDto> mapToReaderDtoList(final List<Reader> readerList){
        return readerList.stream()
                .map(this::mapToReaderDto)
                .collect(Collectors.toList());
    }
}
