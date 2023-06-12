package com.universitymaps.universitymaps.entities;

import javax.persistence.*;

@Entity
@Table(name = "ubicacionesfav")
public class UbicacionFav {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUbicacionFavorita;
    @Column(name = "descripcion",length = 400,nullable = false)
    private String descripcionUbicacionFavorita;
    @Column(name = "ubicacion",nullable = false)
    private int ubicacion;
    @Column(name = "usuario",nullable = false)
    private int usuario;

    public UbicacionFav() {
    }

    public UbicacionFav(int idUbicacionFavorita, String descripcionUbicacionFavorita, int ubicacion, int usuario) {
        this.idUbicacionFavorita = idUbicacionFavorita;
        this.descripcionUbicacionFavorita = descripcionUbicacionFavorita;
        this.ubicacion = ubicacion;
        this.usuario = usuario;
    }

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
