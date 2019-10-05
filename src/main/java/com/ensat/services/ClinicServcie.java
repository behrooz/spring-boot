package com.ensat.services;

import com.ensat.entities.Clinic;

public interface ClinicServcie {

    Iterable<Clinic> getClinicList();

    Clinic getClinicById(Integer id);

    Clinic saveClinic(Clinic clinic);

    void deleteClinic(Integer id);
}
