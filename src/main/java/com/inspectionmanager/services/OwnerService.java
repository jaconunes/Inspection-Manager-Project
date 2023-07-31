package com.inspectionmanager.services;

import com.inspectionmanager.entities.Owner;

import java.util.List;

public interface OwnerService {
    List<Owner> findAll();

    Owner findById(Long id);

    void insert(Owner owner);

    void update(Long id, Owner owner);

    void delete(Long id);
}
