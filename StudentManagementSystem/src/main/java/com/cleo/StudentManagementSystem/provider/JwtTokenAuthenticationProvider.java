package com.cleo.StudentManagementSystem.provider;

import com.cleo.StudentManagementSystem.domain.APIKeyAuthenticationToken;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class JwtTokenAuthenticationProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String key = (String) authentication.getPrincipal();
        if(ObjectUtils.isEmpty(key)) throw new InsufficientAuthenticationException("Key not provided");
        else{
            if("Bangles002".equals(key))
                return new APIKeyAuthenticationToken(key,true);
            else
                throw new BadCredentialsException("Key not valid");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
      return APIKeyAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
