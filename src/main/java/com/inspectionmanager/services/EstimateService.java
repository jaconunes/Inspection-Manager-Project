package com.inspectionmanager.services;

import java.util.List;

public interface EstimateService {

    List<Estimate> findAll();

    Estimate findById(Long id);

    void insert(Estimate orcamento);

    void update(Long id, Estimate orcamento);

    void delete(Long id);
}
