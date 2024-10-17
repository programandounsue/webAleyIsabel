package com.arleyisabel.webArleyIsabel.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;


@Entity
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fecha;
    private String hora;

    // Getter para id
    public Long getId() {
        return id;
    }

    // Setter para id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter para fecha
    public String getFecha() {
        return fecha;
    }

    // Setter para fecha
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    // Getter para hora
    public String getHora() {
        return hora;
    }

    // Setter para hora
    public void setHora(String hora) {
        this.hora = hora;
    }
}