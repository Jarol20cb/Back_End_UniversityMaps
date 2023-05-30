package com.universitymaps.tipomembresiaum.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name= "membresias")
public class Membresia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMembresia;
    @Column(name = "FechaInicioTipoDeMembresia", nullable = false)//control + espacio y el nombre en plural
    private LocalDate FechaInicioTipoDeMembresia;

    @Column(name = "FechaFinTipoDeMembresia", nullable = false)
    private LocalDate FechaFinTipoDeMembresia;

    @Column(name = "DescripcionTipoDeMembresia", length = 150, nullable = false)
    private String DescripcionTipoDeMembresia;

    public  Membresia(){

    }

    public Membresia(int idMembresia, LocalDate fechaInicioTipoDeMembresia, LocalDate fechaFinTipoDeMembresia, String descripcionTipoDeMembresia) {
        this.idMembresia = idMembresia;
        FechaInicioTipoDeMembresia = fechaInicioTipoDeMembresia;
        FechaFinTipoDeMembresia = fechaFinTipoDeMembresia;
        DescripcionTipoDeMembresia = descripcionTipoDeMembresia;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public LocalDate getFechaInicioTipoDeMembresia() {
        return FechaInicioTipoDeMembresia;
    }

    public void setFechaInicioTipoDeMembresia(LocalDate fechaInicioTipoDeMembresia) {
        FechaInicioTipoDeMembresia = fechaInicioTipoDeMembresia;
    }

    public LocalDate getFechaFinTipoDeMembresia() {
        return FechaFinTipoDeMembresia;
    }

    public void setFechaFinTipoDeMembresia(LocalDate fechaFinTipoDeMembresia) {
        FechaFinTipoDeMembresia = fechaFinTipoDeMembresia;
    }

    public String getDescripcionTipoDeMembresia() {
        return DescripcionTipoDeMembresia;
    }

    public void setDescripcionTipoDeMembresia(String descripcionTipoDeMembresia) {
        DescripcionTipoDeMembresia = descripcionTipoDeMembresia;
    }
}
