package com.inspectionmanager.repositories;

import com.inspectionmanager.entities.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {

}
