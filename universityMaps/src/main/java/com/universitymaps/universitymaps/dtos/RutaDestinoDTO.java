package com.universitymaps.universitymaps.dtos;

public class RutaDestinoDTO {
    private String pabellonDestino;
    private String aulaDestino;
    private int contadorDestino;

    public RutaDestinoDTO() {
    }

    public RutaDestinoDTO(String pabellonDestino, String aulaDestino, int contadorDestino) {
        this.pabellonDestino = pabellonDestino;
        this.aulaDestino = aulaDestino;
        this.contadorDestino = contadorDestino;
    }

    public String getPabellonDestino() {
        return pabellonDestino;
    }

    public void setPabellonDestino(String pabellonDestino) {
        this.pabellonDestino = pabellonDestino;
    }

    public String getAulaDestino() {
        return aulaDestino;
    }

    public void setAulaDestino(String aulaDestino) {
        this.aulaDestino = aulaDestino;
    }

    public int getContadorDestino() {
        return contadorDestino;
    }

    public void setContadorDestino(int contadorDestino) {
        this.contadorDestino = contadorDestino;
    }
}
