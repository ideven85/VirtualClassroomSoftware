package com.cleo.lms.security;

import org.apache.logging.log4j.util.Base64Util;
import org.junit.jupiter.api.Test;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;


public class UserDetailsTest {

    @Test
    public void testUserDetails(){
 //       UserDetails u = User.withUsername("Deven").build();

        User.UserBuilder builder = User.withUsername("Deven");

        UserDetails deven = builder.username("Deven")
                .password("1234")
                .authorities("read","write")
                .passwordEncoder(Base64Util::encode)
                .accountExpired(false)
                .disabled(false)
                .build();
    }
}
