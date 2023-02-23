package com.inspectionmanager.repositories;

import com.inspectionmanager.entities.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRespository extends JpaRepository<Photo, Long> {
}
