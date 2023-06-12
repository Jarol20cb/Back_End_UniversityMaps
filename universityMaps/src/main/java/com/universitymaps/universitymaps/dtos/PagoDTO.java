package com.universitymaps.universitymaps.dtos;

import javax.persistence.Column;

public class PagoDTO {
    private int idPago;

    private String descripcionPago;

    private int montoPago;

    private String metodoPago;

    private int tipodemembresia;

    private int usuario;

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getDescripcionPago() {
        return descripcionPago;
    }

    public void setDescripcionPago(String descripcionPago) {
        this.descripcionPago = descripcionPago;
    }

    public int getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(int montoPago) {
        this.montoPago = montoPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public int getTipodemembresia() {
        return tipodemembresia;
    }

    public void setTipodemembresia(int tipodemembresia) {
        this.tipodemembresia = tipodemembresia;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }
}
