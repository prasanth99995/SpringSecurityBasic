package com.SpringSecurityBasic.config;

import org.springframework.security.web.authentication.AuthenticationFilter;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
@Component
public class CustomAuthenticationFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Before Filter");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("After Filter");
    }
}
