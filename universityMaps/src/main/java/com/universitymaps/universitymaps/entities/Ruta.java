package com.universitymaps.universitymaps.entities;

import javax.persistence.*;

@Entity
@Table(name = "rutas")
public class Ruta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRuta;
    @ManyToOne
    @JoinColumn(name = "usuario",nullable = false)
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "destino",nullable = false)
    private Destiny destino;

    public Ruta() {
    }

    public Ruta(int idRuta, Usuario usuario, Destiny destino) {
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Destiny getDestino() {
        return destino;
    }

    public void setDestino(Destiny destino) {
        this.destino = destino;
    }
}
