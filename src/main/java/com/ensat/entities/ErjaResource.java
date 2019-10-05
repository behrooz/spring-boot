package com.ensat.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ErjaResource {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String erja_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getErja_name() {
        return erja_name;
    }

    public void setErja_name(String erja_name) {
        this.erja_name = erja_name;
    }
}
