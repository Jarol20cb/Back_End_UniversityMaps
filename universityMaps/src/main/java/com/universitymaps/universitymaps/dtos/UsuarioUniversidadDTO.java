package com.universitymaps.universitymaps.dtos;

public class UsuarioUniversidadDTO {
    private String nombreUsuario;
    private String nombreUniversidad;

    public UsuarioUniversidadDTO() {
    }

    public UsuarioUniversidadDTO(String nombreUsuario, String nombreUniversidad) {
        this.nombreUsuario = nombreUsuario;
        this.nombreUniversidad = nombreUniversidad;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }
}
