package com.universitymaps.universitymaps.dtos;

public class reporte8 {
    private String nombreUsuario;
    private int contadorUbicacionesFavoritas;

    public reporte8() {
    }

    public reporte8(String nombreUsuario, int contadorUbicacionesFavoritas) {
        this.nombreUsuario = nombreUsuario;
        this.contadorUbicacionesFavoritas = contadorUbicacionesFavoritas;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getContadorUbicacionesFavoritas() {
        return contadorUbicacionesFavoritas;
    }

    public void setContadorUbicacionesFavoritas(int contadorUbicacionesFavoritas) {
        this.contadorUbicacionesFavoritas = contadorUbicacionesFavoritas;
    }
}
