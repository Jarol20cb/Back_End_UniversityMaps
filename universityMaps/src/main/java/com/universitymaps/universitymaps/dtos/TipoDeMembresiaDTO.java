package com.universitymaps.universitymaps.dtos;

import java.time.LocalDate;

public class TipoDeMembresiaDTO {
    private int idTipoDeMembresia;
    private LocalDate fechainicioTipoDeMembresia;
    private LocalDate fechafinTipoDeMembresia;
    private String descripcionTipoDeMembresia;

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
