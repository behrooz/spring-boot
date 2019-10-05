package com.ensat.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Personalinformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Long shomareParvande;
    private String name;
    private String family;
    private boolean gender;
    private String father_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getShomareParvande() {
        return shomareParvande;
    }

    public void setShomareParvande(Long shomareParvande) {
        this.shomareParvande = shomareParvande;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getSh_number() {
        return sh_number;
    }

    public void setSh_number(String sh_number) {
        this.sh_number = sh_number;
    }

    public String getParvande_num() {
        return parvande_num;
    }

    public void setParvande_num(String parvande_num) {
        this.parvande_num = parvande_num;
    }

    public String getChild_num() {
        return child_num;
    }

    public void setChild_num(String child_num) {
        this.child_num = child_num;
    }

    public String getWork_name() {
        return work_name;
    }

    public void setWork_name(String work_name) {
        this.work_name = work_name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getFirst_date() {
        return first_date;
    }

    public void setFirst_date(Date first_date) {
        this.first_date = first_date;
    }

    public Integer getEducation_idIndex() {
        return education_idIndex;
    }

    public void setEducation_idIndex(Integer education_idIndex) {
        this.education_idIndex = education_idIndex;
    }

    public Integer getOld_idIndex() {
        return old_idIndex;
    }

    public void setOld_idIndex(Integer old_idIndex) {
        this.old_idIndex = old_idIndex;
    }

    public Integer getErja_resource_idIndex() {
        return erja_resource_idIndex;
    }

    public void setErja_resource_idIndex(Integer erja_resource_idIndex) {
        this.erja_resource_idIndex = erja_resource_idIndex;
    }

    public Integer getMarrid_state_idIndex() {
        return marrid_state_idIndex;
    }

    public void setMarrid_state_idIndex(Integer marrid_state_idIndex) {
        this.marrid_state_idIndex = marrid_state_idIndex;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    private Date birth_date;
    private String sh_number;
    private String parvande_num;
    private String child_num;
    private String work_name;
    private String tel;
    private String address;
    private Date first_date;
    private Integer education_idIndex;
    private Integer old_idIndex;
    private Integer erja_resource_idIndex;
    private Integer marrid_state_idIndex;
    private Integer user_id;

}
