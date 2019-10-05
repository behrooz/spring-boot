package com.ensat.controllers;

import com.ensat.entities.Clinic;
import com.ensat.services.ClinicServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class ClinicController {

    private ClinicServcie clinicServcie;

    @Autowired
    public void setClinicServcie(ClinicServcie clinicServcie){
        this.clinicServcie = clinicServcie;
    }

    @GetMapping(value = "/clinic/getList")
    public Iterable<Clinic> getList(){
        return clinicServcie.getClinicList();
    }

    @PostMapping(value = "/clinic/edit")
    public Clinic save(@RequestBody Clinic clinic){
        return clinicServcie.saveClinic(clinic);
    }


}
