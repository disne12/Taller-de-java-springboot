package com.example.demo.sumador.model;

public class UsuarioRequest {

    private String usuario;
    private String contrasena;

    public UsuarioRequest(String Usuario, String contrasena) {
        this.usuario = Usuario;
        this.contrasena = contrasena;
    }

    // Getters y Setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
