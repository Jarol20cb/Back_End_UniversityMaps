package com.universitymaps.universitymaps.entities;

import javax.persistence.*;

@Entity
@Table(name = "pagos")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPago;
    @Column(name = "descripcionPago",length = 400,nullable = false)
    private String descripcionPago;
    @Column(name = "montoPago",nullable = false)
    private int montoPago;
    @Column(name = "metodoPago",length = 40,nullable = false)
    private String metodoPago;
    @ManyToOne
    @JoinColumn(name = "tipodemembresia",nullable = false)
    private TipoDeMembresia tipodemembresia;
    @ManyToOne
    @JoinColumn(name = "usuario",nullable = false)
    private Usuario usuario;

    public Pago() {
    }

    public Pago(int idPago, String descripcionPago, int montoPago, String metodoPago, TipoDeMembresia tipodemembresia, Usuario usuario) {
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
