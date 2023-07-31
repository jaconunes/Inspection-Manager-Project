package com.inspectionmanager.services;

import com.inspectionmanager.entities.Renter;

import java.util.List;

public interface RenterService {

    List<Renter> findAll();

    Renter findById(Long id);

    void insert(Renter renter);

    void update(Long id, Renter renter);

    void delete(Long id);
}
