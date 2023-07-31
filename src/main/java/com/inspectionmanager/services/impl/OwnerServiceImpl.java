package com.inspectionmanager.services.impl;

import com.inspectionmanager.entities.Inspect;
import com.inspectionmanager.entities.Owner;
import com.inspectionmanager.repositories.OwnerRepository;
import com.inspectionmanager.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class OwnerServiceImpl implements OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public List<Owner> findAll() {
        return ownerRepository.findAll();
    }

    @Override
    public Owner findById(Long id) {
        Optional<Owner> ownerBd = ownerRepository.findById(id);
        return ownerBd.get();
    }

    @Override
    public void insert(Owner owner) {
        ownerRepository.save(owner);
    }

    @Override
    public void update(Long id, Owner owner) {
        Optional<Owner> ownerBd = ownerRepository.findById(id);
        if(ownerBd.isPresent()){
            ownerRepository.save(owner);
        }
    }

    @Override
    public void delete(Long id) {
        ownerRepository.deleteById(id);
    }
}
