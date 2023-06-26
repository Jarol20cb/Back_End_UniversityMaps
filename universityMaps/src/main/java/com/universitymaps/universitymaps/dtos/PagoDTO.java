package com.universitymaps.universitymaps.dtos;

import com.universitymaps.universitymaps.entities.TipoDeMembresia;
import com.universitymaps.universitymaps.entities.Usuario;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class PagoDTO {
    private int idPago;
    private String descripcionPago;
    private int montoPago;
    private String metodoPago;
    private TipoDeMembresia tipodemembresia;
    private Usuario usuario;

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

    public TipoDeMembresia getTipodemembresia() {
        return tipodemembresia;
    }

    public void setTipodemembresia(TipoDeMembresia tipodemembresia) {
        this.tipodemembresia = tipodemembresia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
