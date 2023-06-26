package com.universitymaps.universitymaps.dtos;

import com.universitymaps.universitymaps.entities.Ubicacion;
import com.universitymaps.universitymaps.entities.Usuario;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class UbicacionFavDTO {
    private int idUbicacionFavorita;
    private String descripcionUbicacionFavorita;
    private Ubicacion ubicacion;
    private Usuario usuario;

    public int getIdUbicacionFavorita() {
        return idUbicacionFavorita;
    }

    public void setIdUbicacionFavorita(int idUbicacionFavorita) {
        this.idUbicacionFavorita = idUbicacionFavorita;
    }

    public String getDescripcionUbicacionFavorita() {
        return descripcionUbicacionFavorita;
    }

    public void setDescripcionUbicacionFavorita(String descripcionUbicacionFavorita) {
        this.descripcionUbicacionFavorita = descripcionUbicacionFavorita;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
