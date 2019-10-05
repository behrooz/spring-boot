package com.ensat.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Rezerver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String family;
    private Date rezerve_date;
    private String name;
    private String tel;
    private Integer status_id;
    private Integer shomareParvande;
    private Integer moalej_id;
    private Integer pardakht_id;
    private Date createdate;
    private Integer multitype;
    private Integer clinic_id;
    private Integer user_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Date getRezerve_date() {
        return rezerve_date;
    }

    public void setRezerve_date(Date rezerve_date) {
        this.rezerve_date = rezerve_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getStatus_id() {
        return status_id;
    }

    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
    }

    public Integer getShomareParvande() {
        return shomareParvande;
    }

    public void setShomareParvande(Integer shomareParvande) {
        this.shomareParvande = shomareParvande;
    }

    public Integer getMoalej_id() {
        return moalej_id;
    }

    public void setMoalej_id(Integer moalej_id) {
        this.moalej_id = moalej_id;
    }

    public Integer getPardakht_id() {
        return pardakht_id;
    }

    public void setPardakht_id(Integer pardakht_id) {
        this.pardakht_id = pardakht_id;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getMultitype() {
        return multitype;
    }

    public void setMultitype(Integer multitype) {
        this.multitype = multitype;
    }

    public Integer getClinic_id() {
        return clinic_id;
    }

    public void setClinic_id(Integer clinic_id) {
        this.clinic_id = clinic_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
