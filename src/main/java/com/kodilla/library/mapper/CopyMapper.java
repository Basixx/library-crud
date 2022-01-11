package com.kodilla.library.mapper;

import com.kodilla.library.domain.reader.Copy;
import com.kodilla.library.domain.reader.CopyDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CopyMapper {

    public Copy mapToCopy(final CopyDto copyDto){
        return new Copy(
                copyDto.getId(),
                copyDto.getTitleId(),
                copyDto.getState()
        );
    }

    public CopyDto mapToCopyDto(final Copy copy){
        return new CopyDto(
                copy.getId(),
                copy.getTitleId(),
                copy.getState()
        );
    }

    public List<CopyDto> mapToCopyDtoList(final List<Copy> copyList){
        return copyList.stream().map(this::mapToCopyDto)
                .collect(Collectors.toList());
    }
}
