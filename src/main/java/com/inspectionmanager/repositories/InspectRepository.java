package com.inspectionmanager.repositories;

import com.inspectionmanager.entities.Inspect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InspectRepository extends JpaRepository<Inspect, Long> {

}
