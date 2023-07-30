package com.inspectionmanager.controllers.rest;

import com.inspectionmanager.entities.Inspect;
import com.inspectionmanager.services.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("surveys")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @GetMapping
    public ResponseEntity<List<Inspect>> findAll(){
        return ResponseEntity.ok(surveyService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Inspect> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(surveyService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Inspect> insert(@RequestBody Inspect inspect){
        surveyService.insert(inspect);
        return ResponseEntity.ok(inspect);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Inspect> update(@PathVariable("id") Long id, @RequestBody Inspect inspect){
        surveyService.update(id, inspect);
        return ResponseEntity.ok(inspect);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        surveyService.delete(id);
        return ResponseEntity.ok().build();
    }
}
