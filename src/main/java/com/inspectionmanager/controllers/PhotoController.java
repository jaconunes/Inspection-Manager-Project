package com.inspectionmanager.controllers;

import com.inspectionmanager.entities.Photo;
import com.inspectionmanager.services.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("photos")
public class PhotoController {

    @Autowired
    private PhotoService photoService;

    @GetMapping
    public ResponseEntity<List<Photo>> findAll(){
        return ResponseEntity.ok(photoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Photo> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(photoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Photo> insert(@RequestBody Photo photo){
        photoService.insert(photo);
        return ResponseEntity.ok(photo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Photo> update(@PathVariable("id") Long id, @RequestBody Photo photo){
        photoService.update(id, photo);
        return ResponseEntity.ok(photo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        photoService.delete(id);
        return ResponseEntity.ok().build();
    }
}
