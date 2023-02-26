package com.inspectionmanager.controllers.rest;

import com.inspectionmanager.entities.Estimate;
import com.inspectionmanager.services.EstimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("estimates")
public class EstimateController {

    @Autowired
    private EstimateService estimateService;

    @GetMapping
    public ResponseEntity<List<Estimate>> findAll(){
        return ResponseEntity.ok(estimateService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estimate> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(estimateService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Estimate> insert(@RequestBody Estimate estimate){
        estimateService.insert(estimate);
        return ResponseEntity.ok(estimate);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estimate> update(@PathVariable("id") Long id, @RequestBody Estimate estimate){
        estimateService.update(id, estimate);
        return ResponseEntity.ok(estimate);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        estimateService.delete(id);
        return ResponseEntity.ok().build();
    }
}
