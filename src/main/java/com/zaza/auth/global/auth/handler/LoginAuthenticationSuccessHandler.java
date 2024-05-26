package com.zaza.auth.global.auth.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zaza.auth.global.common.code.ResponseCode;
import com.zaza.auth.global.common.response.BaseResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
public class LoginAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        log.info("LoginAuthenticationSuccessHandler.onAuthenticationSuccess");

        ObjectMapper objectMapper = new ObjectMapper();

        String responseValue = objectMapper.writeValueAsString(new BaseResponse(ResponseCode.SUCCESS));

        response.setContentType("application/json;");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write(responseValue);
    }
}
