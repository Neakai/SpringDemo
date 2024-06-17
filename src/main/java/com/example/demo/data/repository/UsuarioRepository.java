package com.example.demo.data.repository;

import com.example.demo.data.entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, java.util.UUID> {
}
