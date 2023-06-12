package com.universitymaps.universitymaps.entities;

import javax.persistence.*;

@Entity
@Table(name = "profesores")

public class Profesor {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfesor;
@Column(name = "nombre",length = 40,nullable = false)
    private String nombreProfesor;
@Column(name = "apellidoPaterno",length = 40,nullable = false)
    private String apellidoPaternoProfesor;
    @Column(name = "apellidoMaterno",length = 40,nullable = false)
    private String apellidoMaternoProfesor;
    @Column(name = "calificacion",nullable = false)
    private int calificacionProfesor;
    @Column(name = "universidad",nullable = false)
    private int universidad;

    public Profesor() {
    }

    public Profesor(int idProfesor, String nombreProfesor, String apellidoPaternoProfesor, String apellidoMaternoProfesor, int calificacionProfesor, int universidad) {
        this.idProfesor = idProfesor;
        this.nombreProfesor = nombreProfesor;
        this.apellidoPaternoProfesor = apellidoPaternoProfesor;
        this.apellidoMaternoProfesor = apellidoMaternoProfesor;
        this.calificacionProfesor = calificacionProfesor;
        this.universidad = universidad;
    }

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

    public int getUniversidad() {
        return universidad;
    }

    public void setUniversidad(int universidad) {
        this.universidad = universidad;
    }
}
