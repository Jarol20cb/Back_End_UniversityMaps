package com.universitymaps.universitymaps.dtos;

public class PagoMembresiaDTO {
    private String descripcionMembresia;
    private int contadorUsuarios;

    public PagoMembresiaDTO() {
    }

    public PagoMembresiaDTO(String descripcionMembresia, int contadorUsuarios) {
        this.descripcionMembresia = descripcionMembresia;
        this.contadorUsuarios = contadorUsuarios;
    }

    public String getDescripcionMembresia() {
        return descripcionMembresia;
    }

    public void setDescripcionMembresia(String descripcionMembresia) {
        this.descripcionMembresia = descripcionMembresia;
    }

    public int getContadorUsuarios() {
        return contadorUsuarios;
    }

    public void setContadorUsuarios(int contadorUsuarios) {
        this.contadorUsuarios = contadorUsuarios;
    }
}
