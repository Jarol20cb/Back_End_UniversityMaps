package com.universitymaps.universitymaps.entities;

import javax.persistence.*;

@Entity
@Table(name = "sugerencias")
public class Sugerencia {
@Id
@GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int idSugerencia;
@Column(name = "descripcionSugerencia",length = 300,nullable = false)
    private String descripcionSugerencia;
@ManyToOne
@JoinColumn(name = "usuario",nullable = false)
private Usuario usuario;

    public Sugerencia() {
    }

    public Sugerencia(int idSugerencia, String descripcionSugerencia, Usuario usuario) {
        this.idSugerencia = idSugerencia;
        this.descripcionSugerencia = descripcionSugerencia;
        this.usuario = usuario;
    }

    public int getIdSugerencia() {
        return idSugerencia;
    }

    public void setIdSugerencia(int idSugerencia) {
        this.idSugerencia = idSugerencia;
    }

    public String getDescripcionSugerencia() {
        return descripcionSugerencia;
    }

    public void setDescripcionSugerencia(String descripcionSugerencia) {
        this.descripcionSugerencia = descripcionSugerencia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
