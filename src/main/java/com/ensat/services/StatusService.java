package com.ensat.services;

import com.ensat.entities.Status;

public interface StatusService {

    Iterable<Status> listAllStatus();

    Status getStatusById(Integer id);

    Status saveStatus(Status status);

    void deleteStatus(Integer id);
}
