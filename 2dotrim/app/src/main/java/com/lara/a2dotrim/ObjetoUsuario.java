package com.lara.a2dotrim;

public class ObjetoUsuario {

    private String nombre;
    private String apellido;
    private String dni;
    private String contraseña;
    private String nombreusuario;

    public ObjetoUsuario(String nombre, String apellido, String dni, String contraseña, String nombreusuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.contraseña = contraseña;
        this.nombreusuario = nombreusuario;
    }

    public ObjetoUsuario(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }
}
