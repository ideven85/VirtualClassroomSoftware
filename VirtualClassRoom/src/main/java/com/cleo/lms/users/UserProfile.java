package com.cleo.lms.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserProfile{

    @Id @GeneratedValue private Long id;


    private String firstName;
    private String lastName;

    private String country;

    @Enumerated(EnumType.STRING)
    private UserCategory userCategory;
    enum UserCategory {
        STAFF,STUDENT,ADMIN,USER,GUEST,TEACHER
    }
}
