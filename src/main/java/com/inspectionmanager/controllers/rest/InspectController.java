package com.inspectionmanager.controllers.rest;

import com.inspectionmanager.entities.Inspect;
import com.inspectionmanager.services.InspectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("inspects")
public class InspectController {

    @Autowired
    private InspectService inspectService;

    @GetMapping
    public ResponseEntity<List<Inspect>> findAll(){
        return ResponseEntity.ok(inspectService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Inspect> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(inspectService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Inspect> insert(@RequestBody Inspect inspect){
        inspectService.insert(inspect);
        return ResponseEntity.ok(inspect);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Inspect> update(@PathVariable("id") Long id, @RequestBody Inspect inspect){
        inspectService.update(id, inspect);
        return ResponseEntity.ok(inspect);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        inspectService.delete(id);
        return ResponseEntity.ok().build();
    }
}
