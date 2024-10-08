package com.corhuila.parcial.entity;

import jakarta.persistence.*;


import java.util.List;


@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    @Column(name = "nombre", nullable = true)
    private String nombre;

    @Column(name = "apellido", nullable = true)
    private String apellido;

    @Column(name = "correo", nullable = true)
    private String correo;

    @Column(name = "direccion", nullable = true)
    private String direccion;

    @Column(name = "telefono", nullable = true)
    private String telefono;

    @Column(name = "contraseño", nullable = true)
    private String contraseña;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ControlActividades> controlActividades;

    public Usuario() {
    }

    public Usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Usuario(String apellido, String correo, String direccion, String telefono, String contraseña, List<ControlActividades> controlActividades, Long id_usuario, String nombre) {
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.controlActividades = controlActividades;
        this.id_usuario = id_usuario;
        this.nombre = nombre;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public List<ControlActividades> getControlActividades() {
        return controlActividades;
    }

    public void setControlActividades(List<ControlActividades> controlActividades) {
        this.controlActividades = controlActividades;
    }
}
