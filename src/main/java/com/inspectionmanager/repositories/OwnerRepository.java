package com.inspectionmanager.repositories;

import com.inspectionmanager.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
