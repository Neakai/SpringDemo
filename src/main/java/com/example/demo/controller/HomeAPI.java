package com.example.demo.controller;

import com.example.demo.dto.AuthDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/test")
public interface HomeAPI {

    @GetMapping("/index/{x}")
    ModelAndView ss(
            @PathVariable("x") Integer numero,
            @RequestParam("parametro1") String param1,
            @RequestParam("parametro2") String param2
    );

    @GetMapping("/login")
    ModelAndView handleAuthentication();

    @PostMapping("/login")
    String handleAuthentication(AuthDTO authDTO);

}
