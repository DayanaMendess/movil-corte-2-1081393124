package com.corhuila.parcial.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity

public class ControlActividades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo_actividad;

    @Column(name = "fecha", nullable = true)
    private LocalDateTime fecha;

    @Column(name = "nombre", nullable = true)
    private String nombre;

    @Column(name = "descripcion", nullable = true)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    public ControlActividades() {
    }

    public ControlActividades(Long codigo_actividad, LocalDateTime fecha, String nombre, String descripcion, Usuario usuario) {
        this.codigo_actividad = codigo_actividad;
        this.fecha = fecha;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.usuario = usuario;
    }

    public Long getCodigo_actividad() {
        return codigo_actividad;
    }

    public void setCodigo_actividad(Long codigo_actividad) {
        this.codigo_actividad = codigo_actividad;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

