package com.inspectionmanager.repositories;

import com.inspectionmanager.entities.Renter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RenterRepository extends JpaRepository<Renter, Long> {
}
