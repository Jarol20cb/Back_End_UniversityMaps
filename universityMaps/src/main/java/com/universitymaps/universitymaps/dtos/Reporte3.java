package com.universitymaps.universitymaps.dtos;

public class Reporte3 {

    private String nombreUniversidad;
    private int idUniversidad;

    public Reporte3() {
    }

    public Reporte3(String nombreUniversidad, int idUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
        this.idUniversidad = idUniversidad;
    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public int getIdUniversidad() {
        return idUniversidad;
    }

    public void setIdUniversidad(int idUniversidad) {
        this.idUniversidad = idUniversidad;
    }
}
