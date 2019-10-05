package com.ensat.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Pardakht {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String PardakhtType;
    private Integer UserId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPardakhtType() {
        return PardakhtType;
    }

    public void setPardakhtType(String pardakhtType) {
        PardakhtType = pardakhtType;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }
}
