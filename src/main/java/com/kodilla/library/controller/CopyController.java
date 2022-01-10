package com.kodilla.library.controller;

import com.kodilla.library.domain.reader.CopyDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/library/copy")
public class CopyController {
    @GetMapping(value = "getCopies")
    public List<CopyDto> getCopies(){
        return new ArrayList<>();
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
