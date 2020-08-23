package com.leanperiod.userservice.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@NoArgsConstructor(force = true)
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class User {

    public User(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    private Long identifier;
    private final String firstName;
    private final String lastName;
    private final LocalDate dateOfBirth;
}
