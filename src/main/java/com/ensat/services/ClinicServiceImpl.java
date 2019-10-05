package com.ensat.services;

import com.ensat.entities.Clinic;
import com.ensat.repositories.ClinicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClinicServiceImpl implements ClinicServcie {

    private ClinicRepository clinicServcieRepository;

    @Autowired
    public void ClinicServiceImpl( ClinicRepository clinicServcieRepository){
        this.clinicServcieRepository = clinicServcieRepository;
    }

    @Override
    public Iterable<Clinic> getClinicList() {
        return clinicServcieRepository.findAll();
    }

    @Override
    public Clinic getClinicById(Integer id) {
        return clinicServcieRepository.findOne(id);
    }

    @Override
    public Clinic saveClinic(Clinic clinic) {
        return clinicServcieRepository.save(clinic);
    }

    @Override
    public void deleteClinic(Integer id) {
        clinicServcieRepository.delete(id);
    }
}
