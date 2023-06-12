package com.universitymaps.universitymaps.entities;

import javax.persistence.*;

@Entity
@Table(name = "rutas")
public class Ruta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRuta;
    @Column(name = "usuario",nullable = false)
    private int usuario;
    @Column(name = "destino",nullable = false)
    private int destino;

    public Ruta() {
    }

    public Ruta(int idRuta, int usuario, int destino) {
        this.idRuta = idRuta;
        this.usuario = usuario;
        this.destino = destino;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }
}
