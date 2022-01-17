package com.kodilla.library.service;

import com.kodilla.library.domain.Copy;
import com.kodilla.library.repository.CopyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DbServiceCopy {
    private final CopyRepository copyRepository;
    public List<Copy> getAllCopies() {
        return copyRepository.findAll();
    }

    public Copy saveCopy (final Copy copy){
        return copyRepository.save(copy);
    }

    public Optional<Copy> getCopy (final Long copyId){
        return copyRepository.findById(copyId);
    }

   /* //sposób 1
    public List<Copy> getCopiesCount(String title, String author, int publicationYear, String state){
        return copyRepository.retrieveCopyWithTitleAndAuthorAndPublicationYear(title, author, publicationYear, state);
    }

    //sposób 2
    public int getCopiesCountNumber(final String title, final String author, final int publicationYear, String state){
        return copyRepository.countCopiesByBook_TitleAndBook_AuthorAndBook_PublicationYearAndState();
    }*/
}
