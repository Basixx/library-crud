package com.kodilla.library.controller;

import com.kodilla.library.domain.reader.Copy;
import com.kodilla.library.domain.reader.CopyDto;
import com.kodilla.library.mapper.CopyMapper;
import com.kodilla.library.service.DbService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/library")
@RequiredArgsConstructor
public class CopyController {
    private final DbService service;
    private final CopyMapper copyMapper;

    @GetMapping(value = "getCopies")
    public List<CopyDto> getCopies(){
        List<Copy> copies = service.getAllCopies();
        return copyMapper.mapToCopyDtoList(copies);
    }

    @GetMapping(value = "getCopy")
    public CopyDto getReader(Long copyId){
        return new CopyDto(1L, 1L, "borrowed");
    }

    @DeleteMapping(value = "deleteCopy")
    public void deleteCopy(Long copyId){

    }

    @PutMapping(value = "updateCopy")
    public CopyDto updateCopy (CopyDto copyDto){
        return new CopyDto(1L, 2L, "lost");
    }

    @PostMapping(value = "createCopy")
    public void createCopy(CopyDto copyDto){

    }
}
