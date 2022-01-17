package com.kodilla.library.repository;

import com.kodilla.library.domain.Copy;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CopyRepository extends CrudRepository<Copy, Long> {
    @Override
    Copy save (Copy copy);

    @Override
    List<Copy> findAll();

    /*//sposób 1
    @Query
    List<Copy> retrieveCopyWithTitleAndAuthorAndPublicationYear
            (@Param("TITLE") String title, @Param("AUTHOR") String author, @Param("PUBLICATIONYEAR") int publicationYear, String state);


    //sposób 2
    int countCopiesByBook_TitleAndBook_AuthorAndBook_PublicationYearAndState();*/
}
