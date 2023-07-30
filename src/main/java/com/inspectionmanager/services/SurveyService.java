package com.inspectionmanager.services;

import com.inspectionmanager.entities.Inspect;

import java.util.List;

public interface SurveyService {

    List<Inspect> findAll();

    Inspect findById(Long id);

    void insert(Inspect vistoria);

    void update(Long id, Inspect cliente);

    void delete(Long id);
}
