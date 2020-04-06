package com.codefei.boot2.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("-----preHandler-------");
        HttpSession session = request.getSession();
        Object login_user = session.getAttribute("LOGIN_USER");
        if (login_user != null) {
            return true;
        } else {
            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath + "/");

            return false;
        }


    }
}
