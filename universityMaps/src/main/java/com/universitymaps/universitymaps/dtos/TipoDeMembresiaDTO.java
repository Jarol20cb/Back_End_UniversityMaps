package com.universitymaps.universitymaps.dtos;

import java.time.LocalDate;

public class TipoDeMembresiaDTO {
    private int id;
    private LocalDate fechainicioTipoDeMembresia;
    private LocalDate fechafinTipoDeMembresia;
    private String descripcionTipoDeMembresia;

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
