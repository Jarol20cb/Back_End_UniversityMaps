package com.universitymaps.universitymaps.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "nombreUsuario",length = 40,nullable = false)
    private String nombreUsuario;
    @Column(name = "apellidoPaternoUsuario",length = 40,nullable = false)
    private String apellidoPaternoUsuario;
    @Column(name = "apellidoMaternoUsuario",length = 40,nullable = false)
    private String apellidoMaternoUsuario;
    @Column(name = "fechaNacimientoUsuario",nullable = false)
    private LocalDate fechaNacimientoUsuario;
    @Column(name = "telefonoUsuario",nullable = false)
    private int telefonoUsuario;
    @Column(name = "correoUsuario",length = 40,nullable = false)
    private String correoUsuario;
    @ManyToOne
    @JoinColumn(name = "universidad",nullable = false)
    private Universidad universidad;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUsuario, String apellidoPaternoUsuario, String apellidoMaternoUsuario, LocalDate fechaNacimientoUsuario, int telefonoUsuario, String correoUsuario, Universidad universidad) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoPaternoUsuario = apellidoPaternoUsuario;
        this.apellidoMaternoUsuario = apellidoMaternoUsuario;
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.correoUsuario = correoUsuario;
        this.universidad = universidad;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoPaternoUsuario() {
        return apellidoPaternoUsuario;
    }

    public void setApellidoPaternoUsuario(String apellidoPaternoUsuario) {
        this.apellidoPaternoUsuario = apellidoPaternoUsuario;
    }

    public String getApellidoMaternoUsuario() {
        return apellidoMaternoUsuario;
    }

    public void setApellidoMaternoUsuario(String apellidoMaternoUsuario) {
        this.apellidoMaternoUsuario = apellidoMaternoUsuario;
    }

    public LocalDate getFechaNacimientoUsuario() {
        return fechaNacimientoUsuario;
    }

    public void setFechaNacimientoUsuario(LocalDate fechaNacimientoUsuario) {
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
    }

    public int getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(int telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
}
