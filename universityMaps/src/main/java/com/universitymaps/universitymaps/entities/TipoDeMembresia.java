package com.universitymaps.universitymaps.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "membresiatipos")
public class TipoDeMembresia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoDeMembresia;
    @Column(name = "fechainicioTipoDeMembresia",nullable = false)
    private LocalDate fechainicioTipoDeMembresia;
    @Column(name = "fechafinTipoDeMembresia",nullable = false)
    private LocalDate fechafinTipoDeMembresia;
    @Column(name = "descripcionTipoDeMembresia",length = 300,nullable = false)
    private String descripcionTipoDeMembresia;

    public TipoDeMembresia() {
    }

    public TipoDeMembresia(int idTipoDeMembresia, LocalDate fechainicioTipoDeMembresia, LocalDate fechafinTipoDeMembresia, String descripcionTipoDeMembresia) {
        this.idTipoDeMembresia = idTipoDeMembresia;
        this.fechainicioTipoDeMembresia = fechainicioTipoDeMembresia;
        this.fechafinTipoDeMembresia = fechafinTipoDeMembresia;
        this.descripcionTipoDeMembresia = descripcionTipoDeMembresia;
    }

    public int getIdTipoDeMembresia() {
        return idTipoDeMembresia;
    }

    public void setIdTipoDeMembresia(int idTipoDeMembresia) {
        this.idTipoDeMembresia = idTipoDeMembresia;
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
