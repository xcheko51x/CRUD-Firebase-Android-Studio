package com.xcheko51x.crud_database_firebase;

public class Usuario {

    String usuario;
    String contrasena;
    String telefono;
    String email;

    public Usuario() {
    }

    public Usuario(String usuario, String contrasena, String telefono, String email) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.telefono = telefono;
        this.email = email;
    }

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
