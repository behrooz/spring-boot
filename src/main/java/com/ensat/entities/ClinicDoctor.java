package com.ensat.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ClinicDoctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer moalej_id;
    private Integer clinic_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMoalej_id() {
        return moalej_id;
    }

    public void setMoalej_id(Integer moalej_id) {
        this.moalej_id = moalej_id;
    }

    public Integer getClinic_id() {
        return clinic_id;
    }

    public void setClinic_id(Integer clinic_id) {
        this.clinic_id = clinic_id;
    }
}
