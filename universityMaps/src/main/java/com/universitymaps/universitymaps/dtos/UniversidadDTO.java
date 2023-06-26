package com.universitymaps.universitymaps.dtos;

import javax.persistence.Column;

public class UniversidadDTO {
    private int idUniversidad;
    private String nombreUniversidad;
    private String regionUniversidad;
    private String distritoUniversidad;
    private String calleUniversidad;
    private String telefonoUniversidad;

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
