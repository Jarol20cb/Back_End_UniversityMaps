package com.universitymaps.universitymaps.dtos;

public class reporte6 {
    private String nombreUniversidad;
    private int contadorUsuarios;

    public reporte6() {
    }

    public reporte6(String nombreUniversidad, int contadorUsuarios) {
        this.nombreUniversidad = nombreUniversidad;
        this.contadorUsuarios = contadorUsuarios;
    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public int getContadorUsuarios() {
        return contadorUsuarios;
    }

    public void setContadorUsuarios(int contadorUsuarios) {
        this.contadorUsuarios = contadorUsuarios;
    }
}
