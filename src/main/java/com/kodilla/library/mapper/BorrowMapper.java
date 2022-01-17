package com.kodilla.library.mapper;

import com.kodilla.library.domain.Borrow;
import com.kodilla.library.domain.BorrowDto;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BorrowMapper {

    public Borrow mapToBorrow(final BorrowDto borrowDto){
        return new Borrow(
                borrowDto.getId(),
                borrowDto.getReader(),
                borrowDto.getBorrowDate(),
                borrowDto.getReturnDate(),
                borrowDto.getCopy()
        );
    }

    public BorrowDto mapToBorrowDto(final Borrow borrow){

        return new BorrowDto(
                borrow.getId(),
                borrow.getReader(),
                borrow.getBorrowDate(),
                borrow.getReturnDate(),
                borrow.getCopy()
        );
    }

    public List<BorrowDto> mapToBorrowDtoList(final List<Borrow> borrowList){
        return borrowList.stream()
                .map(this::mapToBorrowDto)
                .collect(Collectors.toList());
    }
}
