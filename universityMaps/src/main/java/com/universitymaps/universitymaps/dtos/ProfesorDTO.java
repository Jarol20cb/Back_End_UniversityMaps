package com.universitymaps.universitymaps.dtos;

import com.universitymaps.universitymaps.entities.Universidad;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ProfesorDTO {
    private int idProfesor;
    private String nombreProfesor;
    private String apellidoPaternoProfesor;
    private String apellidoMaternoProfesor;
    private int calificacionProfesor;
    private Universidad universidad;

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getApellidoPaternoProfesor() {
        return apellidoPaternoProfesor;
    }

    public void setApellidoPaternoProfesor(String apellidoPaternoProfesor) {
        this.apellidoPaternoProfesor = apellidoPaternoProfesor;
    }

    public String getApellidoMaternoProfesor() {
        return apellidoMaternoProfesor;
    }

    public void setApellidoMaternoProfesor(String apellidoMaternoProfesor) {
        this.apellidoMaternoProfesor = apellidoMaternoProfesor;
    }

    public int getCalificacionProfesor() {
        return calificacionProfesor;
    }

    public void setCalificacionProfesor(int calificacionProfesor) {
        this.calificacionProfesor = calificacionProfesor;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
}
