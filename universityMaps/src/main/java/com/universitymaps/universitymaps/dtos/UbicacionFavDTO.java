package com.universitymaps.universitymaps.dtos;

import javax.persistence.Column;

public class UbicacionFavDTO {
    private int idUbicacionFavorita;

    private String descripcionUbicacionFavorita;

    private int ubicacion;

    private int usuario;

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

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }
}
