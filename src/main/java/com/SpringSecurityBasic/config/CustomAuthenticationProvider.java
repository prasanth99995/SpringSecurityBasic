package com.SpringSecurityBasic.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();

        if("prashanth".equals(username) && "12345".equals(password)){
            return new UsernamePasswordAuthenticationToken(username,password, Arrays.asList());
        }else{
            throw new BadCredentialsException("Invalid Username & Password");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return  authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
