package com.cleo.StudentManagementSystem.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Suppose we are authenticating using basic username/password
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String userName;

    private String password;

}
