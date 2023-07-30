package com.inspectionmanager.repositories;

import com.inspectionmanager.entities.Inspect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository extends JpaRepository<Inspect, Long> {

}
