package com.universitymaps.universitymaps.entities;

import javax.persistence.*;

@Entity
@Table(name = "sugerencias")
public class Sugerencia {
@Id
@GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
@Column(name = "Descripcion",length = 300,nullable = false)
    private String descripcionSugerencia;

    public Sugerencia() {
    }

    public Sugerencia(int id, String descripcionSugerencia) {
        this.id = id;
        this.descripcionSugerencia = descripcionSugerencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcionSugerencia() {
        return descripcionSugerencia;
    }

    public void setDescripcionSugerencia(String descripcionSugerencia) {
        this.descripcionSugerencia = descripcionSugerencia;
    }
}
