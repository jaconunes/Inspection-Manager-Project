package com.inspectionmanager.services;

import com.inspectionmanager.entities.Inspect;

import java.util.List;

public interface InspectService {

    List<Inspect> findAll();

    Inspect findById(Long id);

    void insert(Inspect inspect);

    void update(Long id, Inspect inspect);

    void delete(Long id);
}
