package com.universitymaps.universitymaps.entities;

import javax.persistence.*;

@Entity
@Table(name = "universidades")
public class Universidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUniversidad;
    @Column(name = "nombreUniversidad",length = 50,nullable = false)
    private String nombreUniversidad;
    @Column(name = "regionUniversidad",length = 50,nullable = false)
    private String regionUniversidad;
    @Column(name = "distritoUniversidad",length = 50,nullable = false)
    private String distritoUniversidad;
    @Column(name = "calleUniversidad",length = 50)
    private String calleUniversidad;
    @Column(name = "telefonoUniversidad",length = 9,nullable = false)
    private String telefonoUniversidad;

    public Universidad() {
    }

    public Universidad(int idUniversidad, String nombreUniversidad, String regionUniversidad, String distritoUniversidad, String calleUniversidad, String telefonoUniversidad) {
        this.idUniversidad = idUniversidad;
        this.nombreUniversidad = nombreUniversidad;
        this.regionUniversidad = regionUniversidad;
        this.distritoUniversidad = distritoUniversidad;
        this.calleUniversidad = calleUniversidad;
        this.telefonoUniversidad = telefonoUniversidad;
    }

    public int getIdUniversidad() {
        return idUniversidad;
    }

    public void setIdUniversidad(int idUniversidad) {
        this.idUniversidad = idUniversidad;
    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public String getRegionUniversidad() {
        return regionUniversidad;
    }

    public void setRegionUniversidad(String regionUniversidad) {
        this.regionUniversidad = regionUniversidad;
    }

    public String getDistritoUniversidad() {
        return distritoUniversidad;
    }

    public void setDistritoUniversidad(String distritoUniversidad) {
        this.distritoUniversidad = distritoUniversidad;
    }

    public String getCalleUniversidad() {
        return calleUniversidad;
    }

    public void setCalleUniversidad(String calleUniversidad) {
        this.calleUniversidad = calleUniversidad;
    }

    public String getTelefonoUniversidad() {
        return telefonoUniversidad;
    }

    public void setTelefonoUniversidad(String telefonoUniversidad) {
        this.telefonoUniversidad = telefonoUniversidad;
    }
}
