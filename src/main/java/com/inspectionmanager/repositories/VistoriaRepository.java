package com.inspectionmanager.repositories;

import com.inspectionmanager.entities.Vistoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VistoriaRepository extends JpaRepository<Vistoria, Long> {

}
