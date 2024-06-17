package com.example.demo.service.impl;

import com.example.demo.data.entity.Usuario;
import com.example.demo.data.repository.UsuarioRepository;
import com.example.demo.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<Usuario> getAll() {
        return this.usuarioRepository.findAll();
    }

    @Override
    public Usuario getById(UUID id) {
//        java.util.Optional<Usuario> optional = this.usuarioRepository.findById(id);
//
//        Usuario user = null;
//        if (optional.isPresent()) {
//            user = optional.get();
//            return user;
//        }
//
//        throw new RuntimeException();

        return this.usuarioRepository.findById(id).orElseThrow();
    }

    @Override
    public boolean isAdmin(UUID id) {
        Usuario usuario = this.usuarioRepository.findById(id).orElseThrow();
        return usuario.getRol().equals("Admin");
    }

    @Override
    public boolean login(String username, String password) {
//        Usuario usuario = this.usuarioRepository.findByName(username).orElseThrow();
//        return usuario.getPassword().equals(password);
        return false;
    }

}
