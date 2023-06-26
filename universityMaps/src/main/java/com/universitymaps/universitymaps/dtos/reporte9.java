package com.universitymaps.universitymaps.dtos;

public class reporte9 {
    private String descripcionMembresia;
    private int sumaMonto;

    public reporte9() {
    }

    public reporte9(String descripcionMembresia, int sumaMonto) {
        this.descripcionMembresia = descripcionMembresia;
        this.sumaMonto = sumaMonto;
    }

    public String getDescripcionMembresia() {
        return descripcionMembresia;
    }

    public void setDescripcionMembresia(String descripcionMembresia) {
        this.descripcionMembresia = descripcionMembresia;
    }

    public int getSumaMonto() {
        return sumaMonto;
    }

    public void setSumaMonto(int sumaMonto) {
        this.sumaMonto = sumaMonto;
    }
}
