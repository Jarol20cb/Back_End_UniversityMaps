package com.universitymaps.university.entities;

import javax.persistence.*;

@Entity
@Table(name = "university")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUniversity;
    @Column(name = "nameUniversity", length = 50, nullable = false)
    private String nameUniversity;

    @Column(name = "regionUniversity", length = 35, nullable = false)
    private String regionUniversity;

    @Column(name = "districtUniversity", length = 50, nullable = false)
    private String districtUniversity;

    @Column(name = "addressUniversity", length = 50, nullable = false)
    private String addressUniversity;

    @Column(name = "phoneUniversity", length = 9, nullable = false)
    private String phoneUniversity;

    public University() {
    }

    public University(int idUniversity, String nameUniversity, String regionUniversity, String districtUniversity, String addressUniversity, String phoneUniversity) {
        this.idUniversity = idUniversity;
        this.nameUniversity = nameUniversity;
        this.regionUniversity = regionUniversity;
        this.districtUniversity = districtUniversity;
        this.addressUniversity = addressUniversity;
        this.phoneUniversity = phoneUniversity;
    }

    public int getIdUniversity() {
        return idUniversity;
    }

    public void setIdUniversity(int idUniversity) {
        this.idUniversity = idUniversity;
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    public String getRegionUniversity() {
        return regionUniversity;
    }

    public void setRegionUniversity(String regionUniversity) {
        this.regionUniversity = regionUniversity;
    }

    public String getDistrictUniversity() {
        return districtUniversity;
    }

    public void setDistrictUniversity(String districtUniversity) {
        this.districtUniversity = districtUniversity;
    }

    public String getAddressUniversity() {
        return addressUniversity;
    }

    public void setAddressUniversity(String addressUniversity) {
        this.addressUniversity = addressUniversity;
    }

    public String getPhoneUniversity() {
        return phoneUniversity;
    }

    public void setPhoneUniversity(String phoneUniversity) {
        this.phoneUniversity = phoneUniversity;
    }
}
