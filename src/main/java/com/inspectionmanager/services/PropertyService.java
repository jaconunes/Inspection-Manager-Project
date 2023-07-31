package com.inspectionmanager.services;

import com.inspectionmanager.entities.Property;

import java.util.List;

public interface PropertyService {
    List<Property> findAll();

    Property findById(Long id);

    void insert(Property property);

    void update(Long id, Property property);

    void delete(Long id);
}
