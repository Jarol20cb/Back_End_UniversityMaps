package com.universitymaps.tipomembresiaum.dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class MembresiaDTO {

    private int idMembresia;
    private LocalDate FechaInicioTipoDeMembresia;
    private LocalDate FechaFinTipoDeMembresia;
    private String DescripcionTipoDeMembresia;

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
