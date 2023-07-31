package com.inspectionmanager.controllers.rest;

import com.inspectionmanager.entities.Property;
import com.inspectionmanager.services.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("properties")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping
    public ResponseEntity<List<Property>> findAll(){
        return ResponseEntity.ok(propertyService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Property> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(propertyService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Property> insert(@RequestBody Property property){
        propertyService.insert(property);
        return ResponseEntity.ok(property);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Property> update(@PathVariable("id") Long id, @RequestBody Property property){
        propertyService.update(id, property);
        return ResponseEntity.ok(property);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        propertyService.delete(id);
        return ResponseEntity.ok().build();
    }
}
