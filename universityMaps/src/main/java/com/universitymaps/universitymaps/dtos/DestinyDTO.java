package com.universitymaps.universitymaps.dtos;

import javax.persistence.Column;

public class DestinyDTO {
    private int idDestino;
    private String aulaDestino;
    private String pabellonDestino;
    private String facultadDestino;

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
