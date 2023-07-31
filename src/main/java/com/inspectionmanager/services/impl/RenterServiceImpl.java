package com.inspectionmanager.services.impl;

import com.inspectionmanager.entities.Renter;
import com.inspectionmanager.repositories.RenterRepository;
import com.inspectionmanager.services.RenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RenterServiceImpl implements RenterService {

    @Autowired
    private RenterRepository renterRepository;

    @Override
    public List<Renter> findAll() {
        return renterRepository.findAll();
    }

    @Override
    public Renter findById(Long id) {
        return renterRepository.findById(id).get();
    }

    @Override
    public void insert(Renter renter) {
        renterRepository.save(renter);
    }

    @Override
    public void update(Long id, Renter renter) {
        Optional<Renter> renterBd = renterRepository.findById(id);
        if (renterBd.isPresent()){
            renterRepository.save(renter);
        }
    }

    @Override
    public void delete(Long id) {
        renterRepository.deleteById(id);
    }
}
