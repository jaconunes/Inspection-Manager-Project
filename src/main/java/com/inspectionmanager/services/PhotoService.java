package com.inspectionmanager.services;

import com.inspectionmanager.entities.Photo;

import java.util.List;

public interface PhotoService {

    List<Photo> findAll();

    Photo findById(Long id);

    void insert(Photo photo);

    void update(Long id, Photo photo);

    void delete(Long id);
}
