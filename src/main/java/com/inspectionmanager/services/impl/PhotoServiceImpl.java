package com.inspectionmanager.services.impl;

import com.inspectionmanager.entities.Photo;
import com.inspectionmanager.repositories.PhotoRespository;
import com.inspectionmanager.services.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PhotoServiceImpl implements PhotoService {

    @Autowired
    private PhotoRespository photoRespository;

    @Override
    public List<Photo> findAll() {
        return photoRespository.findAll();
    }

    @Override
    public Photo findById(Long id) {
        return photoRespository.findById(id).get();
    }

    @Override
    public void insert(Photo photo) {
        photoRespository.save(photo);
    }

    @Override
    public void update(Long id, Photo photo) {
        Optional<Photo> photoDb = photoRespository.findById(id);
        if(photoDb.isPresent()){
            photoRespository.save(photo);
        }
    }

    @Override
    public void delete(Long id) {
        photoRespository.deleteById(id);
    }
}
