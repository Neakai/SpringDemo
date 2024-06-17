package com.example.demo.service.impl;

import com.example.demo.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public String authenticate(String email, String password) {
        if (email.equals("José") && password.equals("1234")) {
            return "este sería el token";
        }
        throw new RuntimeException();
    }

}
