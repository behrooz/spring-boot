package com.ensat.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Old {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String OldYear;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOldYear() {
        return OldYear;
    }

    public void setOldYear(String oldYear) {
        OldYear = oldYear;
    }
}
