package com.universitymaps.universitymaps.entities;

import javax.persistence.*;

@Entity
@Table(name = "ubicaciones")
public class Ubicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUbicacion;
    @Column(name = "descripcion",nullable = false)
    private String descripcionUbicacion;
    @Column(name = "universidad",nullable = false)
    private int universidad;

    public Ubicacion() {
    }

    public Ubicacion(int idUbicacion, String descripcionUbicacion, int universidad) {
        this.idUbicacion = idUbicacion;
        this.descripcionUbicacion = descripcionUbicacion;
        this.universidad = universidad;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getDescripcionUbicacion() {
        return descripcionUbicacion;
    }

    public void setDescripcionUbicacion(String descripcionUbicacion) {
        this.descripcionUbicacion = descripcionUbicacion;
    }

    public int getUniversidad() {
        return universidad;
    }

    public void setUniversidad(int universidad) {
        this.universidad = universidad;
    }
}
