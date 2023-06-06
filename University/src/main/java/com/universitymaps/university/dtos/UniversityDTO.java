package com.universitymaps.university.dtos;

import javax.persistence.Column;

public class UniversityDTO {
    private int idUniversity;
    private String nameUniversity;
    private String regionUniversity;
    private String districtUniversity;
    private String addressUniversity;
    private String phoneUniversity;

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
