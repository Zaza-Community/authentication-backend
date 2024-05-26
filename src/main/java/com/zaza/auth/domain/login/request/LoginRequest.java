package com.zaza.auth.domain.login.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {

    private String id;
    private String password;

}
