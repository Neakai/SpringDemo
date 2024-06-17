package com.example.demo.controller;

import com.example.demo.model.AuthDTO;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/login")
public interface AuthAPI {

    @PostMapping(path = "", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    java.util.Map<String, ?> handleLogin(@RequestBody AuthDTO authDTO);

}
