package com.universitymaps.universitymaps.entities;

import javax.persistence.*;

@Entity
@Table(name = "ubicacionesfav")
public class UbicacionFav {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUbicacionFavorita;
    @Column(name = "descripcionUbicacionFavorita",length = 400,nullable = false)
    private String descripcionUbicacionFavorita;
    @ManyToOne
    @JoinColumn(name = "ubicacion",nullable = false)
    private Ubicacion ubicacion;
    @ManyToOne
    @JoinColumn(name = "usuario",nullable = false)
    private Usuario usuario;

    public UbicacionFav() {
    }

    public UbicacionFav(int idUbicacionFavorita, String descripcionUbicacionFavorita, Ubicacion ubicacion, Usuario usuario) {
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
