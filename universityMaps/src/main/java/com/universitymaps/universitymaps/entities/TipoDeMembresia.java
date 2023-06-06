package com.universitymaps.universitymaps.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "membresiatipos")
public class TipoDeMembresia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "fechaInicio",nullable = false)
    private LocalDate fechainicioTipoDeMembresia;
    @Column(name = "fechaFin",nullable = false)
    private LocalDate fechafinTipoDeMembresia;
    @Column(name = "descripcion",length = 300,nullable = false)
    private String descripcionTipoDeMembresia;

    public TipoDeMembresia() {
    }

    public TipoDeMembresia(int id, LocalDate fechainicioTipoDeMembresia, LocalDate fechafinTipoDeMembresia, String descripcionTipoDeMembresia) {
        this.id = id;
        this.fechainicioTipoDeMembresia = fechainicioTipoDeMembresia;
        this.fechafinTipoDeMembresia = fechafinTipoDeMembresia;
        this.descripcionTipoDeMembresia = descripcionTipoDeMembresia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechainicioTipoDeMembresia() {
        return fechainicioTipoDeMembresia;
    }

    public void setFechainicioTipoDeMembresia(LocalDate fechainicioTipoDeMembresia) {
        this.fechainicioTipoDeMembresia = fechainicioTipoDeMembresia;
    }

    public LocalDate getFechafinTipoDeMembresia() {
        return fechafinTipoDeMembresia;
    }

    public void setFechafinTipoDeMembresia(LocalDate fechafinTipoDeMembresia) {
        this.fechafinTipoDeMembresia = fechafinTipoDeMembresia;
    }

    public String getDescripcionTipoDeMembresia() {
        return descripcionTipoDeMembresia;
    }

    public void setDescripcionTipoDeMembresia(String descripcionTipoDeMembresia) {
        this.descripcionTipoDeMembresia = descripcionTipoDeMembresia;
    }
}
