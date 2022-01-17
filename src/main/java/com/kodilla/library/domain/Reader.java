package com.kodilla.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@NoArgsConstructor
@Getter
@AllArgsConstructor
@Setter
@Entity(name = "reader")
public class Reader {

        @Id
        @GeneratedValue
        @Column(name = "id")
        private Long id;

        @Column(name = "firstname")
        private String firstname;

        @Column(name = "lastname")
        private String lastname;

        @Column(name = "account_creation_date")
        private LocalDate accountCreationDate;

        @OneToMany (targetEntity = Borrow.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "reader")
        private Set<Borrow> borrows;

        public Reader(String firstname, String lastname){
                this.firstname = firstname;
                this.lastname = lastname;
                this.accountCreationDate = LocalDate.now();
        }
}

