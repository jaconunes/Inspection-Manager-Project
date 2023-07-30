package com.inspectionmanager.services.impl;

import com.inspectionmanager.repositories.EstimateRepository;
import com.inspectionmanager.services.EstimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstimateServiceImpl implements EstimateService {

    @Autowired
    private EstimateRepository estimateRepository;

    @Override
    public List<Estimate> findAll() {
        return estimateRepository.findAll();
    }

    @Override
    public Estimate findById(Long id) {
        Optional<Estimate> estimateDb = estimateRepository.findById(id);
        return estimateDb.get();
    }

    @Override
    public void insert(Estimate orcamento) {
        estimateRepository.save(orcamento);
    }

    @Override
    public void update(Long id, Estimate estimate) {
        Optional<Estimate> estimateDb = estimateRepository.findById(id);
        if(estimateDb.isPresent()){
            estimateRepository.save(estimate);
        }
    }

    @Override
    public void delete(Long id) {
        estimateRepository.deleteById(id);
    }
}
