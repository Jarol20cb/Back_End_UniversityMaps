package com.universitymaps.universitymaps.entities;

import javax.persistence.*;

@Entity
@Table(name = "pagos")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPago;
    @Column(name = "descripcion",length = 400,nullable = false)
    private String descripcionPago;
    @Column(name = "monto",nullable = false)
    private int montoPago;
    @Column(name = "metodo",length = 40,nullable = false)
    private String metodoPago;
    @Column(name = "tipoMembresia",nullable = false)
    private int tipodemembresia;
    @Column(name = "usuario",nullable = false)
    private int usuario;

    public Pago() {
    }

    public Pago(int idPago, String descripcionPago, int montoPago, String metodoPago, int tipodemembresia, int usuario) {
        this.idPago = idPago;
        this.descripcionPago = descripcionPago;
        this.montoPago = montoPago;
        this.metodoPago = metodoPago;
        this.tipodemembresia = tipodemembresia;
        this.usuario = usuario;
    }

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
