package com.inspectionmanager.services.impl;

import com.inspectionmanager.entities.Property;
import com.inspectionmanager.repositories.PropertyRepository;
import com.inspectionmanager.services.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    @Override
    public List<Property> findAll() {
        return propertyRepository.findAll();
    }

    @Override
    public Property findById(Long id) {
        return propertyRepository.findById(id).get();
    }

    @Override
    public void insert(Property property) {
        propertyRepository.save(property);
    }

    @Override
    public void update(Long id, Property property) {
        Optional<Property> propertyBd = propertyRepository.findById(id);
        if (propertyBd.isPresent()){
            propertyRepository.save(property);
        }
    }

    @Override
    public void delete(Long id) {
        propertyRepository.deleteById(id);
    }
}
