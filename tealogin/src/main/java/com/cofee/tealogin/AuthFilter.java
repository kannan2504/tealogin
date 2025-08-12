/*package com.cofee.tealogin;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

@Component
public class AuthFilter implements Filter {


    public void doFilter(ServletRequest request , ServletResponse response, FilterChain chain) throws IOException, ServletException
    {
        HttpServletRequest req=(HttpServletRequest) request;
        HttpServletResponse res=(HttpServletResponse) response;
        String path=req.getRequestURI();

        if(path.startsWith("/login")|| path.startsWith("/register")){
            chain.doFilter(request,response);
            return;
        }
          req.getSession(false)
          if(session!=null)

            }
}
*/