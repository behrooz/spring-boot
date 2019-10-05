package com.ensat.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Records {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Date date_moraje;
    private String shekayat_asli;
    private String khadamat;
    private Integer moalej_id1;
    private Integer personalinformation_id;
    private Integer tashkhis_id;
    private String picture;
    private Integer shomareParvande;
    private Integer user_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate_moraje() {
        return date_moraje;
    }

    public void setDate_moraje(Date date_moraje) {
        this.date_moraje = date_moraje;
    }

    public String getShekayat_asli() {
        return shekayat_asli;
    }

    public void setShekayat_asli(String shekayat_asli) {
        this.shekayat_asli = shekayat_asli;
    }

    public String getKhadamat() {
        return khadamat;
    }

    public void setKhadamat(String khadamat) {
        this.khadamat = khadamat;
    }

    public Integer getMoalej_id1() {
        return moalej_id1;
    }

    public void setMoalej_id1(Integer moalej_id1) {
        this.moalej_id1 = moalej_id1;
    }

    public Integer getPersonalinformation_id() {
        return personalinformation_id;
    }

    public void setPersonalinformation_id(Integer personalinformation_id) {
        this.personalinformation_id = personalinformation_id;
    }

    public Integer getTashkhis_id() {
        return tashkhis_id;
    }

    public void setTashkhis_id(Integer tashkhis_id) {
        this.tashkhis_id = tashkhis_id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getShomareParvande() {
        return shomareParvande;
    }

    public void setShomareParvande(Integer shomareParvande) {
        this.shomareParvande = shomareParvande;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
