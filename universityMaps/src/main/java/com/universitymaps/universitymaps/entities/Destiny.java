package com.universitymaps.universitymaps.entities;

import javax.persistence.*;

@Entity
@Table(name = "destinies")
public class Destiny {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDestino;
    @Column(name = "aulaDestino",length = 40,nullable = false)
    private String aulaDestino;
    @Column(name = "pabellonDestino",length = 40,nullable = false)
    private String pabellonDestino;
    @Column(name = "facultadDestino",length = 40,nullable = false)
    private String facultadDestino;

    public Destiny() {
    }

    public Destiny(int idDestino, String aulaDestino, String pabellonDestino, String facultadDestino) {
        this.idDestino = idDestino;
        this.aulaDestino = aulaDestino;
        this.pabellonDestino = pabellonDestino;
        this.facultadDestino = facultadDestino;
    }

    public int getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
    }

    public String getAulaDestino() {
        return aulaDestino;
    }

    public void setAulaDestino(String aulaDestino) {
        this.aulaDestino = aulaDestino;
    }

    public String getPabellonDestino() {
        return pabellonDestino;
    }

    public void setPabellonDestino(String pabellonDestino) {
        this.pabellonDestino = pabellonDestino;
    }

    public String getFacultadDestino() {
        return facultadDestino;
    }

    public void setFacultadDestino(String facultadDestino) {
        this.facultadDestino = facultadDestino;
    }
}
