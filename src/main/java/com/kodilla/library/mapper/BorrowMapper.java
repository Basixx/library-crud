package com.kodilla.library.mapper;

import com.kodilla.library.domain.reader.Borrow;
import com.kodilla.library.domain.reader.BorrowDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BorrowMapper {

    public Borrow mapToBorrow(final BorrowDto borrowDto){
        return new Borrow(
                borrowDto.getId(),
                borrowDto.getCopyId(),
                borrowDto.getReaderId(),
                borrowDto.getBorrowDate(),
                borrowDto.getReturnDate()
        );
    }

    public BorrowDto mapToBorrowDto(final Borrow borrow){
        return new BorrowDto(
                borrow.getId(),
                borrow.getCopyId(),
                borrow.getReaderId(),
                borrow.getBorrowDate(),
                borrow.getReturnDate()
        );
    }

    public List<BorrowDto> mapToBorrowDtoList(final List<Borrow> borrowList){
        return borrowList.stream()
                .map(this::mapToBorrowDto)
                .collect(Collectors.toList());
    }
}
