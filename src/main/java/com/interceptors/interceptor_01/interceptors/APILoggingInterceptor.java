package com.interceptors.interceptor_01.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class APILoggingInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String userString = request.getHeader("User-Agent");
        if (userString != null) {
            System.out.println(userString);
            return true;
        } else {
            return false;
        }
    }
}