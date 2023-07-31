package com.inspectionmanager.controllers.rest;

import com.inspectionmanager.entities.Owner;
import com.inspectionmanager.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("owners")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @GetMapping
    public ResponseEntity<List<Owner>> findAll(){
        return ResponseEntity.ok(ownerService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Owner> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(ownerService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Owner> insert(@RequestBody Owner owner){
        ownerService.insert(owner);
        return ResponseEntity.ok(owner);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Owner> update(@PathVariable("id") Long id, @RequestBody Owner owner){
        ownerService.update(id, owner);
        return ResponseEntity.ok(owner);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        ownerService.delete(id);
        return ResponseEntity.ok().build();
    }
}
