package com.kodilla.library.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/*@NamedQuery(
        name = "Copy.retrieveCopyWithTitleAndAuthorAndPublicationYear",
        query = "FROM copy WHERE state = 'available' AND book.title = :TITLE AND book.author = :AUTHOR AND " +
                "book.publicationYear = :PUBLICATIONYEAR"
)*/

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "copy")
public class Copy {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "title_id")
    private Book book;

    @Column(name = "state")
    private String state;

    @OneToMany(targetEntity = Borrow.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "copy")
    private List<Borrow> borrows;

    public Copy(Book book, String state) {
        this.book = book;
        this.state = state;
    }
}
