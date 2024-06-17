package com.example.demo.controller;

import com.example.demo.data.entity.Usuario;
import com.example.demo.dto.AuthDTO;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    private final UsuarioService usuarioService;

    public UserController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("")
    public List<Usuario> getAll() {
        return this.usuarioService.getAll();
    }

    @PostMapping("/login2")
    public String ss(@RequestBody AuthDTO authDTO) {
        boolean isAuthenticated = this.usuarioService.login(authDTO.username(), authDTO.password());

        if (isAuthenticated) {
            return "autenticado";
        } else return "no autenticado";
    }



}
