package com.tecsup.jsfprime.model;

import java.util.logging.Logger;

public class Persona {
    private Long id;
    
    private String nombres;

    private String apellidos;

    private String codigo;

    public Persona(){}
    
    public Persona(Long id, String nombres, String apellidos, String codigo) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
    }

    public Long getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    

    
}
