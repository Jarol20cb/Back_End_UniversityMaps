package com.universitymaps.universitymaps.entities;

import javax.persistence.*;

@Entity
@Table(name = "destinies")
public class Destiny {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "aula",length = 40,nullable = false)
    private String aulaDestino;
    @Column(name = "pabellon",length = 40,nullable = false)
    private String pabellonDestino;
    @Column(name = "facultad",length = 40,nullable = false)
    private String facultadDestino;

    public Destiny() {
    }

    public Destiny(int id, String aulaDestino, String pabellonDestino, String facultadDestino) {
        this.id = id;
        this.aulaDestino = aulaDestino;
        this.pabellonDestino = pabellonDestino;
        this.facultadDestino = facultadDestino;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
