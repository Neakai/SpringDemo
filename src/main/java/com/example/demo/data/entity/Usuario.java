package com.example.demo.data.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "User")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true)
    private String nombre;

    private String password;

    private Integer edad;

    private String comentario;

    private String rol;

    // <<-GETTERS & SETTERS->>
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String role) {
        this.rol = role;
    }
}
