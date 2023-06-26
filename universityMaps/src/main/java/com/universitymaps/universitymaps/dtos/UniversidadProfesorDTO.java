package com.universitymaps.universitymaps.dtos;

public class UniversidadProfesorDTO {
    private String nombreUniversidad;
    private float promedioProfesor;

    public UniversidadProfesorDTO() {
    }

    public UniversidadProfesorDTO(String nombreUniversidad, float promedioProfesor) {
        this.nombreUniversidad = nombreUniversidad;
        this.promedioProfesor = promedioProfesor;
    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public float getPromedioProfesor() {
        return promedioProfesor;
    }

    public void setPromedioProfesor(float promedioProfesor) {
        this.promedioProfesor = promedioProfesor;
    }
}
