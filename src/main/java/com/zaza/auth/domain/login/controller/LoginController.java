package com.zaza.auth.domain.login.controller;

import com.zaza.auth.domain.login.request.LoginRequest;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Response Estimate", description = "Response Estimate API")
public class LoginController {

    @PostMapping("/login")
    public void login(@RequestBody LoginRequest request) {
        System.out.println("request = " + request);
    }
}
