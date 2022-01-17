package com.kodilla.library.controller;

import com.kodilla.library.controller.exception.CopyNotFoundException;
import com.kodilla.library.domain.Copy;
import com.kodilla.library.domain.CopyDto;
import com.kodilla.library.mapper.CopyMapper;
import com.kodilla.library.service.DbServiceCopy;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/library")
@RequiredArgsConstructor
public class CopyController {
    private final DbServiceCopy service;
    private final CopyMapper copyMapper;

    @GetMapping(value = "getCopies")
    public List<CopyDto> getCopies(){
        List<Copy> copies = service.getAllCopies();
        return copyMapper.mapToCopyDtoList(copies);
    }

    @GetMapping(value = "getCopy")
    public CopyDto getReader(@RequestParam Long copyId) throws CopyNotFoundException {
        return copyMapper.mapToCopyDto(
                service.getCopy(copyId).orElseThrow(CopyNotFoundException::new)
        );
    }

    @DeleteMapping(value = "deleteCopy")
    public void deleteCopy(Long copyId){

    }

    @PutMapping(value = "updateCopy")
    public CopyDto updateCopy (@RequestBody CopyDto copyDto){
        Copy copy = copyMapper.mapToCopy(copyDto);
        Copy savedCopy = service.saveCopy(copy);
        return copyMapper.mapToCopyDto(savedCopy);
    }

    @PostMapping(value = "createCopy")
    public void createCopy(CopyDto copyDto){

    }

   /* @GetMapping(value = "getCopiesCount")
    public int copiesCount (@RequestParam String title,
                            @RequestParam String author,
                            @RequestParam int publicationYear){
        List<Copy> copiesOfSameBook = service.getCopiesCount(title, author, publicationYear, "available");
        return copiesOfSameBook.size();
    }*/

    /*@GetMapping(value = "getCopiesCountNumber")
    public int copiesCountNumber (@RequestParam String title,
                                  @RequestParam String author,
                                  @RequestParam int publicationYear){
        return service.getCopiesCountNumber(title, author, publicationYear, "available");
    }*/
}
