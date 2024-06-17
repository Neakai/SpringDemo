package com.example.demo.service;

import com.example.demo.data.entity.Usuario;

import java.util.List;
import java.util.UUID;

public interface UsuarioService {

    List<Usuario> getAll();

    Usuario getById(UUID id);

    boolean isAdmin(UUID id);

    boolean login(String username, String password);

}
