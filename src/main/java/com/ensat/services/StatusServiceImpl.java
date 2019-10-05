package com.ensat.services;

import com.ensat.entities.Status;
import com.ensat.repositories.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusServiceImpl implements StatusService {

    private StatusRepository statusRepository;

    @Autowired
    public void StatusServiceImpl(StatusRepository statusRepository){
        this.statusRepository = statusRepository;
    }

    @Override
    public Iterable<Status> listAllStatus() {
        return statusRepository.findAll();
    }

    @Override
    public Status getStatusById(Integer id) {
        return (Status) statusRepository.findOne(id);
    }

    @Override
    public Status saveStatus(Status status) {
        return (Status) statusRepository.save(status);
    }

    @Override
    public void deleteStatus(Integer id) {
        statusRepository.delete(id);
    }
}
