package com.interceptors.interceptor_01.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class LegacyInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!request.getRequestURL().toString().contains("/legacy")) {
            return true;
        }
        response.setStatus(410);
        throw new Exception("This endpoint is blocked");
    }
}
