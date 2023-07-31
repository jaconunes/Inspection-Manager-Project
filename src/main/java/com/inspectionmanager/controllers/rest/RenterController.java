package com.inspectionmanager.controllers.rest;

import com.inspectionmanager.entities.Renter;
import com.inspectionmanager.services.RenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("renters")
public class RenterController {

    @Autowired
    private RenterService renterService;

    @GetMapping
    public ResponseEntity<List<Renter>> findAll(){
        return ResponseEntity.ok(renterService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Renter> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(renterService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Renter> insert(@RequestBody Renter renter){
        renterService.insert(renter);
        return ResponseEntity.ok(renter);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Renter> update(@PathVariable("id") Long id, @RequestBody Renter renter){
        renterService.update(id, renter);
        return ResponseEntity.ok(renter);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        renterService.delete(id);
        return ResponseEntity.ok().build();
    }
}
