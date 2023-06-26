package com.universitymaps.universitymaps.dtos;

import com.universitymaps.universitymaps.entities.Destiny;
import com.universitymaps.universitymaps.entities.Usuario;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class RutaDTO {
    private int idRuta;
    private Usuario usuario;
    private Destiny destino;

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
