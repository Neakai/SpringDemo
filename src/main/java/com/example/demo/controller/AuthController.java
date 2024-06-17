package com.example.demo.controller;

import com.example.demo.model.AuthDTO;
import com.example.demo.service.LoginService;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AuthController implements AuthAPI {

    private final LoginService loginService;

    public AuthController(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public Map<String, ?> handleLogin(AuthDTO authDTO) {
        String token = this.loginService.authenticate(authDTO.email(), authDTO.password());
        return Map.of("token", token);
    }

}
