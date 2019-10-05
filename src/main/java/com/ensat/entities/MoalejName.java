package com.ensat.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class MoalejName {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String moalej_name;
    private Integer user_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMoalej_name() {
        return moalej_name;
    }

    public void setMoalej_name(String moalej_name) {
        this.moalej_name = moalej_name;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
